CREATE TABLE issues (
    id int generated always as identity,
    title VARCHAR(150) NOT NULL,
    assignee VARCHAR(100),
    type VARCHAR(15) NOT NULL,
    primary key (id)
);