DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001ZZ100000000ML364';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = 'HK36' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = 'HK36';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001ZZ100000000ML364';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001ZZ100000000ML365';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001ZZ100000000ML365';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000ML366';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000ML367';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000ML368';
DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000000ML35R';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000000ML35R';
DELETE FROM pub_function WHERE pk_billtype = 'HK36';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000000ML35R';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'HK36';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000000ML35R';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000ML35S';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000ML35T';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000ML35U';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000ML35V';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000ML35W';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000ML35X';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000ML35Y';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000ML35Z';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000ML360';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000ML361';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000ML362';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000ML363';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000000ML35Q';
delete from pub_print_datasource where ctemplateid = '0001ZZ100000000ML2XJ';
delete from pub_print_cell where ctemplateid = '0001ZZ100000000ML2XJ';
delete from pub_print_line where ctemplateid = '0001ZZ100000000ML2XJ';
delete from pub_print_variable where ctemplateid = '0001ZZ100000000ML2XJ';
delete from pub_print_template where ctemplateid = '0001ZZ100000000ML2XJ';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000000ML2XI';
delete from pub_query_condition where pk_templet = '0001ZZ100000000ML2W8';
delete from pub_query_templet where id = '0001ZZ100000000ML2W8';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000000ML2W7';
delete from pub_billtemplet_b where pk_billtemplet = '0001ZZ100000000ML2U4';
delete from pub_billtemplet where pk_billtemplet = '0001ZZ100000000ML2U4';
DELETE FROM pub_billtemplet_t WHERE pk_billtemplet = '0001ZZ100000000ML2U4';
DELETE FROM sm_menuitemreg WHERE pk_menuitem = '0001ZZ100000000ML2U3';
DELETE FROM sm_funcregister WHERE cfunid = '0001ZZ100000000ML2U1';
DELETE FROM sm_paramregister WHERE pk_param = '0001ZZ100000000ML2U2';
