DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001ZZ100000001CGTLN';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = 'HK44' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = 'HK44';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001ZZ100000001CGTLN';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001ZZ100000001CGTLO';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001ZZ100000001CGTLO';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000001CGTLP';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000001CGTLQ';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000001CGTLR';
DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000001CGTLA';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000001CGTLA';
DELETE FROM pub_function WHERE pk_billtype = 'HK44';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000001CGTLA';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'HK44';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000001CGTLA';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000001CGTLB';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000001CGTLC';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000001CGTLD';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000001CGTLE';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000001CGTLF';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000001CGTLG';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000001CGTLH';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000001CGTLI';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000001CGTLJ';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000001CGTLK';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000001CGTLL';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000001CGTLM';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000001CGTL9';
delete from pub_print_datasource where ctemplateid = '0001ZZ100000001CGTD0';
delete from pub_print_cell where ctemplateid = '0001ZZ100000001CGTD0';
delete from pub_print_line where ctemplateid = '0001ZZ100000001CGTD0';
delete from pub_print_variable where ctemplateid = '0001ZZ100000001CGTD0';
delete from pub_print_template where ctemplateid = '0001ZZ100000001CGTD0';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000001CGTCZ';
delete from pub_query_condition where pk_templet = '0001ZZ100000001CGTC2';
delete from pub_query_templet where id = '0001ZZ100000001CGTC2';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000001CGTC1';
delete from pub_billtemplet_b where pk_billtemplet = '0001ZZ100000001CGT9W';
delete from pub_billtemplet where pk_billtemplet = '0001ZZ100000001CGT9W';
DELETE FROM pub_billtemplet_t WHERE pk_billtemplet = '0001ZZ100000001CGT9W';
DELETE FROM sm_menuitemreg WHERE pk_menuitem = '0001ZZ100000001CGT9V';
DELETE FROM sm_funcregister WHERE cfunid = '0001ZZ100000001CGT9T';
DELETE FROM sm_paramregister WHERE pk_param = '0001ZZ100000001CGT9U';
