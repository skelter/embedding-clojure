Vagrant PostgreSQL Server Setup
--------------------------------
To keep this repo light, and future-flexible, I'm not including all of
the puppet modules, but will include the prep to get the example working.

We will be using Vagrant, puppet and the postgresql client.  You *could* install
PostgreSQL server on your machine

#. VirtualBox
#. Vagrant
#. Ruby [1.8 2.0)
#. sudo gem install puppet
#. cd to the example directory and use puppet to install the postgresql modules

   $ puppet module install puppetlabs-postgresql --modulepath modules

#. cd to the vagrantdbserver
#. vagrant up
