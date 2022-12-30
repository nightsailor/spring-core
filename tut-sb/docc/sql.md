```sql
CREATE TABLE playground (
    equip_id serial PRIMARY KEY,
    type varchar (50) NOT NULL,
    color varchar (25) NOT NULL,
    location varchar(25) check (location in ('north', 'south', 'west', 'east', 'northeast', 'southeast', 'southwest', 'northwest')),
    install_date date
);
```

```sql
INSERT INTO playground (type, color, location, install_date) VALUES ('slide', 'blue', 'south', '2017-04-28');
INSERT INTO playground (type, color, location, install_date) VALUES ('swing', 'yellow', 'northwest', '2018-08-16');
```

```sql
SELECT * FROM playground;
```

```sql
DELETE FROM playground WHERE type = 'slide';
```

```sql
ALTER TABLE playground ADD last_maint date;
```

```sql
ALTER TABLE playground DROP last_maint;
```

```sql
UPDATE playground SET color = 'red' WHERE type = 'swing';
```

```sql

\du

\d

\l

ALTER USER "postgres" WITH PASSWORD 'password';

CREATE DATABASE student;

GRANT ALL PRIVILEGES ON DATABASE "student" TO talha;

GRANT ALL PRIVILEGES ON DATABASE "student" TO postgres;

\c student

SELECT * FROM student;

```