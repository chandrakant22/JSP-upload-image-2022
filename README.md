# JSP-upload-image-2022
JSP upload image and show it in JSP page. JSP / Servlet / MySql / Eclipse jee neon / Apache Tomcat 7


--
-- Create schema : jspimage
--

CREATE DATABASE IF NOT EXISTS jspimage;
USE jspimage;



--
-- Create table : image_tbl
--

DROP TABLE IF EXISTS `image_tbl`;
CREATE TABLE `image_tbl` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `imageName` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

