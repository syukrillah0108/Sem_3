-- Active: 1700203756843@@127.0.0.1@3306

SELECT * FROM "TIF" LIMIT 100;

CREATE FUNCTION time_diff(query TEXT) RETURNS DECIMAL
BEGIN
  DECLARE start_time DECIMAL;
  DECLARE end_time DECIMAL;
  SET start_time = NOW();
  CALL query;
  SET end_time = NOW();
  RETURN end_time - start_time;
END;

SELECT time_diff("SELECT * FROM prov LIMIT 10;");

CREATE FUNCTION time_diff(query TEXT) RETURNS DECIMAL
BEGIN
  DECLARE start_time DECIMAL;
  DECLARE end_time DECIMAL;
  DECLARE error_message VARCHAR(255);

  SET start_time = NOW();
  START TRANSACTION;
  TRY
    CALL query;
    SET end_time = NOW();
  CATCH e
    SET error_message = e.message;
    ROLLBACK;
    RETURN NULL;
  END TRY;
  COMMIT;

  IF error_message IS NOT NULL THEN
    SIGNAL SQLSTATE 'HY000' SET MESSAGE_TEXT = error_message;
  END IF;

  RETURN end_time - start_time;
END;
