DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000000MSLAA';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000000MSLAA';
DELETE FROM pub_function WHERE pk_billtype = 'HK37';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000000MSLAA';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'HK37';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000000MSLAA';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000MSLAB';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000MSLAC';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000MSLAD';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000MSLAE';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000MSLAF';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000MSLAG';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000MSLAH';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000MSLAI';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000MSLAJ';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000MSLAK';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000MSLAL';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000MSLAM';
