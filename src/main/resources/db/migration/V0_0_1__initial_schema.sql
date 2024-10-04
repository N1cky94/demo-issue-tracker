CREATE TABLE IF NOT EXISTS users (
    id int generated always as identity,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    role VARCHAR(50) NOT NULL,
    primary key (id)
);

INSERT INTO users (password, email, role) VALUES
('password123', 'user1@example.com', 'admin'),
('password456', 'user2@example.com', 'user'),
('password789', 'user3@example.com', 'user'),
('password101', 'user4@example.com', 'moderator'),
('password465', 'user7@example.com', 'user'),
('password102', 'user5@example.com', 'user');