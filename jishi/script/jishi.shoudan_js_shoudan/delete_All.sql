DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001ZZ100000000062LG';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = 'HK52' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = 'HK52';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001ZZ100000000062LG';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001ZZ100000000062LH';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001ZZ100000000062LH';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000062LI';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000062LJ';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000062LK';
DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000000062L2';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000000062L2';
DELETE FROM pub_function WHERE pk_billtype = 'HK52';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000000062L2';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'HK52';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000000062L2';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000062L4';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000062L5';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000062L6';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000062L7';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000062L8';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000062L9';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000062LA';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000062LB';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000062LC';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000062LD';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000062LE';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000062LF';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000000062L1';
delete from pub_print_datasource where ctemplateid = '0001ZZ100000000062FS';
delete from pub_print_cell where ctemplateid = '0001ZZ100000000062FS';
delete from pub_print_line where ctemplateid = '0001ZZ100000000062FS';
delete from pub_print_variable where ctemplateid = '0001ZZ100000000062FS';
delete from pub_print_template where ctemplateid = '0001ZZ100000000062FS';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000000062FR';
delete from pub_query_condition where pk_templet = '0001ZZ100000000062EV';
delete from pub_query_templet where id = '0001ZZ100000000062EV';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000000062EU';
delete from pub_billtemplet_b where pk_billtemplet = '0001ZZ100000000062D8';
delete from pub_billtemplet where pk_billtemplet = '0001ZZ100000000062D8';
DELETE FROM pub_billtemplet_t WHERE pk_billtemplet = '0001ZZ100000000062D8';
DELETE FROM sm_menuitemreg WHERE pk_menuitem = '0001ZZ100000000062D7';
DELETE FROM sm_funcregister WHERE cfunid = '0001ZZ100000000062D5';
DELETE FROM sm_paramregister WHERE pk_param = '0001ZZ100000000062D6';
