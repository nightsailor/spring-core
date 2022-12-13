# Installing PostgreSQL

- sudo apt update
- sudo apt install postgresql postgresql-contrib
- sudo service postgresql start

# Using PostgreSQL Roles and Databases

- sudo -i -u postgres
- psql
- postgres=# \q

# Misc

- sudo -u sammy psql
- sudo -u postgres psql

- postgres@server:~$ createuser --interactive or
- sudo -u postgres createuser --interactive

- postgres@server:~$ createdb sammy or
- sudo -u postgres createdb sammy

- postgres=# \conninfo
- postgres=# \d
- postgres=# \dt

- postgres@server:~$ psql -d postgres ( connect to a different db )

- su - (or) sudo -i (root)
- sudo passwd shaik (edit password)
- sudo adduser sammy (add user)
- sudo -i -u sammy (change user)
