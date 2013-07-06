
exec { 'apt-get update':
  command => '/usr/bin/apt-get update'
}

group { "puppet":
   ensure => "present",
}
 
File { owner => 0, group => 0, mode => 0644 }
 
file { '/etc/motd':
    content => "Welcome to your Vagrant-built PostgreSQL server
                Managed by Puppet.\n"
}

# Ugh.  Oracle's license agreement causes pain so hopefully openjdk will work
class { 'java': 
  distribution => 'jdk',

}

class { 'postgresql::server':
  config_hash => {
    'ip_mask_deny_postgres_user' => '0.0.0.0/32',
    'ip_mask_allow_all_users' => '0.0.0.0/0',
    'listen_addresses'           => '*',
    'ipv4acls'                   => ['hostssl all johndoe 192.168.0.0/24 cert'],
    'manage_redhat_firewall'     => true,
    'postgres_password'          => 'emb3d',
   },
}

# This may need tweaking for linux and postgresql distribution.
# TODO: long-term robustness of pljava
exec { 'apt-get pljava':
  command => '/usr/bin/apt-get install postgresql-9.1-pljava'
}

postgresql::db { 'clojuredb':
  user     => 'clojuser',
  password => 'clojpass',
}

exec { 'install PL/java into clojuredb':
    command => '/usr/bin/psql -d clojuredb -f /usr/share/postgresql-9.1-pljava/install.sql',
    user => 'postgres',
}

#exec { 'permissions for PL/java for clojuser':
#   command => '/usr/bin/psql -d clojuredb -c 'GRANT ALL ON java to clojuser'',
#   user    => 'postgres',
#}
