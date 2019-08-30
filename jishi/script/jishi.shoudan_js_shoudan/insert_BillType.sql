INSERT INTO bd_billtype (ts, iseditableproperty, pk_billtypecode, ncbrcode, parentbilltype, canextendtransaction, istransaction, isbizflowbill, datafinderclz, isaccount, referclassname, pk_org, billtypename, isroot, component, emendenumclass, billcoderule, dr, nodecode, isenablebutton, pk_billtypeid, systemcode, classname, checkclassname, accountclass, islock, forwardbilltype, billtypename2, billtypename3, billtypename4, transtype_class, billtypename5, pk_group, billtypename6, webnodecode, billstyle, def3, isapprovebill, isenabletranstypebcr, def2, wherestring, def1 ) VALUES ('2016-05-12 16:42:11', null, 'HK52', '~', '~', 'Y', 'N', null, null, null, null, 'GLOBLE00000000000000', '手单流水', null, 'js_shoudan', null, '~', null, 'HKJ60202', null, '0001ZZ100000000062L2', 'HKJTsrgk', null, null, null, null, null, null, null, null, null, null, '~', null, '~', null, null, 'Y', null, null, null, null );
INSERT INTO pub_billaction (ts, actionstyleremark, pushflag, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote5, actionnote, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2016-05-12 16:43:05', null, null, '0001ZZ100000000062L2', 'N', 'N', '0001ZZ100000000062L4', null, 'SAVE', null, null, '送审', null, null, 10, 'N', '1', null, 'HK52', null );
INSERT INTO pub_billaction (ts, actionstyleremark, pushflag, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote5, actionnote, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2016-05-12 16:43:05', null, null, '0001ZZ100000000062L2', 'N', 'N', '0001ZZ100000000062L5', null, 'APPROVE', null, null, '审核', null, null, 11, 'N', '2', null, 'HK52', null );
INSERT INTO pub_billaction (ts, actionstyleremark, pushflag, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote5, actionnote, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2016-05-12 16:43:05', null, null, '0001ZZ100000000062L2', 'Y', 'Y', '0001ZZ100000000062L6', null, 'UNSAVEBILL', null, null, '收回', null, null, 13, 'N', '3', null, 'HK52', null );
INSERT INTO pub_billaction (ts, actionstyleremark, pushflag, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote5, actionnote, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2016-05-12 16:43:05', null, null, '0001ZZ100000000062L2', 'N', 'Y', '0001ZZ100000000062L7', null, 'UNAPPROVE', null, null, '弃审', null, null, 12, 'N', '3', null, 'HK52', null );
INSERT INTO pub_billaction (ts, actionstyleremark, pushflag, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote5, actionnote, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2016-05-12 16:43:05', null, null, '0001ZZ100000000062L2', 'N', 'N', '0001ZZ100000000062L8', null, 'DELETE', null, null, '删除', null, null, 30, 'N', '3', null, 'HK52', null );
INSERT INTO pub_billaction (ts, actionstyleremark, pushflag, pk_billtypeid, controlflag, finishflag, pk_billaction, actionnote6, actiontype, actionnote4, actionnote5, actionnote, actionnote2, actionnote3, action_type, constrictflag, actionstyle, showhint, pk_billtype, dr ) VALUES ('2016-05-12 16:43:05', null, null, '0001ZZ100000000062L2', 'N', 'N', '0001ZZ100000000062L9', null, 'SAVEBASE', null, null, '保存', null, null, 31, 'Y', '1', null, 'HK52', null );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-05-12 16:43:05', '0001ZZ100000000062L2', '~', 'N_HK52_SAVE', 'N', 'SAVE', '~', 0, 'HK52', '0001ZZ100000000062LA' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-05-12 16:43:05', '0001ZZ100000000062L2', '~', 'N_HK52_APPROVE', 'N', 'APPROVE', '~', 0, 'HK52', '0001ZZ100000000062LB' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-05-12 16:43:05', '0001ZZ100000000062L2', '~', 'N_HK52_UNSAVEBILL', 'N', 'UNSAVEBILL', '~', 0, 'HK52', '0001ZZ100000000062LC' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-05-12 16:43:05', '0001ZZ100000000062L2', '~', 'N_HK52_UNAPPROVE', 'N', 'UNAPPROVE', '~', 0, 'HK52', '0001ZZ100000000062LD' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-05-12 16:43:05', '0001ZZ100000000062L2', '~', 'N_HK52_DELETE', 'N', 'DELETE', '~', 0, 'HK52', '0001ZZ100000000062LE' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-05-12 16:43:05', '0001ZZ100000000062L2', '~', 'N_HK52_SAVEBASE', 'N', 'SAVEBASE', '~', 0, 'HK52', '0001ZZ100000000062LF' );
