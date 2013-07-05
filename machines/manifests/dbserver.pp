#include postgresql::server

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

postgresql::db { 'clojuredb':
  user     => 'clojuser',
  password => 'clojpass',
}


