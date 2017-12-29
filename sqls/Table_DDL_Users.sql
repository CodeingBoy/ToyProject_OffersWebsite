USE OffersWebsite;
CREATE TABLE Users(
  ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Username VARCHAR(20) NOT NULL,
  HashedPassword TEXT NOT NULL,
  NickName NVARCHAR(20) NOT NULL,
  RegisterTime DATETIME NOT NULL DEFAULT NOW(),
  LastLoginTime DATETIME DEFAULT NOW(),
  LastLoginIPAddress VARCHAR(39) -- length of IPv6 address
);