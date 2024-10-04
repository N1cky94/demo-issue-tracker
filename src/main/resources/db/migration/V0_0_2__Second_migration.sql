ALTER TABLE users ADD COLUMN last_logged_in TIMESTAMP;
UPDATE users SET last_logged_in = NOW();