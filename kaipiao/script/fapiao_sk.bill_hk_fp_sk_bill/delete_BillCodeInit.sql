DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001ZZ100000000ML364';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = 'HK36' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = 'HK36';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001ZZ100000000ML364';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001ZZ100000000ML365';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001ZZ100000000ML365';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000ML366';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000ML367';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000ML368';
