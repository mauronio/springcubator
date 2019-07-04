--------------------------------------------------------
-- Archivo creado  - miércoles-julio-03-2019   
--------------------------------------------------------
REM INSERTING into DEMO.ITEM
SET DEFINE OFF;
Insert into DEMO.ITEM (MASTER_ID,ID,DESCRIPTION,AMOUNT) values ('A1','I1','Item A1I1','10');
Insert into DEMO.ITEM (MASTER_ID,ID,DESCRIPTION,AMOUNT) values ('A1','I2','Item A1I2','20');
Insert into DEMO.ITEM (MASTER_ID,ID,DESCRIPTION,AMOUNT) values ('A1','I3','Item A1I3','30');
Insert into DEMO.ITEM (MASTER_ID,ID,DESCRIPTION,AMOUNT) values ('A2','I1','Item A2I1','40');
Insert into DEMO.ITEM (MASTER_ID,ID,DESCRIPTION,AMOUNT) values ('A2','I2','Item A2I2','50');
REM INSERTING into DEMO.MASTER
SET DEFINE OFF;
Insert into DEMO.MASTER (ID,NAME,DESCRIPTION) values ('A1','Master 1','Master number one');
Insert into DEMO.MASTER (ID,NAME,DESCRIPTION) values ('A2','Master 2','Master number two');
Insert into DEMO.MASTER (ID,NAME,DESCRIPTION) values ('A3','Master 3','Master number three');
