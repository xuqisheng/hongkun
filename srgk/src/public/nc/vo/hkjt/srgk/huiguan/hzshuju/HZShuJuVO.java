/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.hkjt.srgk.huiguan.hzshuju;

import nc.vo.pub.*;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 * 在此处添加此类的描述信息
 * </p>
 * 创建日期:
 * 
 * @author
 * @version NCPrj ??
 */
@SuppressWarnings("serial")
public class HZShuJuVO extends SuperVO {
	private java.lang.String pk_hk_srgk_hg_hzshuju;
	private java.lang.String pk_group;
	private java.lang.String pk_org;
	private java.lang.String pk_org_v;
	private java.lang.String pk_dept;
	private java.lang.String pk_fdept;
	private nc.vo.pub.lang.UFDate hzdate;
	private java.lang.String pk_srxm;
	private nc.vo.pub.lang.UFDouble yingshou;
	private nc.vo.pub.lang.UFDouble zdyh;
	private nc.vo.pub.lang.UFDouble sgyh;
	private nc.vo.pub.lang.UFDouble shishou;
	private nc.vo.pub.lang.UFDouble kblyh;
	private nc.vo.pub.lang.UFDouble qrsr;
	private nc.vo.pub.lang.UFDouble xianjin;
	private nc.vo.pub.lang.UFDouble pos;
	private nc.vo.pub.lang.UFDouble zhipiao;
	private nc.vo.pub.lang.UFDouble huiyuanka;
	private nc.vo.pub.lang.UFDouble fenqu;
	private nc.vo.pub.lang.UFDouble miandan;
	private nc.vo.pub.lang.UFDouble daijinquan;
	private nc.vo.pub.lang.UFDouble cika;
	private nc.vo.pub.lang.UFDouble qtyh;
	private nc.vo.pub.lang.UFDouble huiyuankashiji;
	private java.lang.String vdef1;
	private java.lang.String vdef2;
	private java.lang.String vdef3;
	private java.lang.String vdef4;
	private java.lang.String vdef5;
	private java.lang.Integer dr = 0;
	private nc.vo.pub.lang.UFDateTime ts;
	private Integer uptype;
	private String srxm_code;
	private Integer Srxm_levelno;
	private String srxm_name;
	private String srxm_fpk;
	private String srxm_fcode;
	private String srxm_fname;
	private String vbillcode;
	private String vrowno;
	
	private UFDouble wanglai;
	private UFDouble youhui_sg_01;
	private UFDouble youhui_sg_02;
	private UFDouble youhui_sg_03;
	private UFDouble youhui_sg_04;
	private UFDouble youhui_sg_05;
	private UFDouble youhui_sg_06;
	private UFDouble youhui_sg_07;
	private UFDouble youhui_sg_08;
	private UFDouble youhui_sg_09;
	private UFDouble youhui_sg_10;
	
	private UFBoolean isshowdept;
	

	
	public nc.vo.pub.lang.UFDouble getZhipiao() {
		return zhipiao;
	}

	public void setZhipiao(nc.vo.pub.lang.UFDouble zhipiao) {
		this.zhipiao = zhipiao;
	}

	public UFBoolean getIsshowdept() {
		return isshowdept;
	}

	public void setIsshowdept(UFBoolean isshowdept) {
		this.isshowdept = isshowdept;
	}

	public UFDouble getYouhui_sg_01() {
		return youhui_sg_01;
	}

	public void setYouhui_sg_01(UFDouble youhui_sg_01) {
		this.youhui_sg_01 = youhui_sg_01;
	}

	public UFDouble getYouhui_sg_02() {
		return youhui_sg_02;
	}

	public void setYouhui_sg_02(UFDouble youhui_sg_02) {
		this.youhui_sg_02 = youhui_sg_02;
	}

	public UFDouble getYouhui_sg_03() {
		return youhui_sg_03;
	}

	public void setYouhui_sg_03(UFDouble youhui_sg_03) {
		this.youhui_sg_03 = youhui_sg_03;
	}

	public UFDouble getYouhui_sg_04() {
		return youhui_sg_04;
	}

	public void setYouhui_sg_04(UFDouble youhui_sg_04) {
		this.youhui_sg_04 = youhui_sg_04;
	}

	public UFDouble getYouhui_sg_05() {
		return youhui_sg_05;
	}

	public void setYouhui_sg_05(UFDouble youhui_sg_05) {
		this.youhui_sg_05 = youhui_sg_05;
	}

	public UFDouble getYouhui_sg_06() {
		return youhui_sg_06;
	}

	public void setYouhui_sg_06(UFDouble youhui_sg_06) {
		this.youhui_sg_06 = youhui_sg_06;
	}

	public UFDouble getYouhui_sg_07() {
		return youhui_sg_07;
	}

	public void setYouhui_sg_07(UFDouble youhui_sg_07) {
		this.youhui_sg_07 = youhui_sg_07;
	}

	public UFDouble getYouhui_sg_08() {
		return youhui_sg_08;
	}

	public void setYouhui_sg_08(UFDouble youhui_sg_08) {
		this.youhui_sg_08 = youhui_sg_08;
	}

	public UFDouble getYouhui_sg_09() {
		return youhui_sg_09;
	}

	public void setYouhui_sg_09(UFDouble youhui_sg_09) {
		this.youhui_sg_09 = youhui_sg_09;
	}

	public UFDouble getYouhui_sg_10() {
		return youhui_sg_10;
	}

	public void setYouhui_sg_10(UFDouble youhui_sg_10) {
		this.youhui_sg_10 = youhui_sg_10;
	}

	public UFDouble getWanglai() {
		return wanglai;
	}

	public void setWanglai(UFDouble wanglai) {
		this.wanglai = wanglai;
	}

	public String getVbillcode() {
		return vbillcode;
	}

	public void setVbillcode(String vbillcode) {
		this.vbillcode = vbillcode;
	}

	public String getVrowno() {
		return vrowno;
	}

	public void setVrowno(String vrowno) {
		this.vrowno = vrowno;
	}

	public nc.vo.pub.lang.UFDouble getHuiyuankashiji() {
		return huiyuankashiji;
	}

	public void setHuiyuankashiji(nc.vo.pub.lang.UFDouble huiyuankashiji) {
		this.huiyuankashiji = huiyuankashiji;
	}

	public nc.vo.pub.lang.UFDouble getQtyh() {
		return qtyh;
	}

	public void setQtyh(nc.vo.pub.lang.UFDouble qtyh) {
		this.qtyh = qtyh;
	}

	public String getSrxm_fpk() {
		return srxm_fpk;
	}

	public void setSrxm_fpk(String srxm_fpk) {
		this.srxm_fpk = srxm_fpk;
	}

	public String getSrxm_fcode() {
		return srxm_fcode;
	}

	public void setSrxm_fcode(String srxm_fcode) {
		this.srxm_fcode = srxm_fcode;
	}

	public String getSrxm_fname() {
		return srxm_fname;
	}

	public void setSrxm_fname(String srxm_fname) {
		this.srxm_fname = srxm_fname;
	}

	public String getSrxm_code() {
		return srxm_code;
	}

	public void setSrxm_code(String srxm_code) {
		this.srxm_code = srxm_code;
	}

	public Integer getSrxm_levelno() {
		return Srxm_levelno;
	}

	public void setSrxm_levelno(Integer srxm_levelno) {
		Srxm_levelno = srxm_levelno;
	}

	public String getSrxm_name() {
		return srxm_name;
	}

	public void setSrxm_name(String srxm_name) {
		this.srxm_name = srxm_name;
	}

	public Integer getUptype() {
		return uptype;
	}

	public void setUptype(Integer uptype) {
		this.uptype = uptype;
	}

	public static final String PK_HK_SRGK_HG_HZSHUJU = "pk_hk_srgk_hg_hzshuju";
	public static final String PK_GROUP = "pk_group";
	public static final String PK_ORG = "pk_org";
	public static final String PK_ORG_V = "pk_org_v";
	public static final String PK_DEPT = "pk_dept";
	public static final String PK_FDEPT = "pk_fdept";
	public static final String HZDATE = "hzdate";
	public static final String PK_SRXM = "pk_srxm";
	public static final String YINGSHOU = "yingshou";
	public static final String ZDYH = "zdyh";
	public static final String SGYH = "sgyh";
	public static final String SHISHOU = "shishou";
	public static final String KBLYH = "kblyh";
	public static final String QRSR = "qrsr";
	public static final String XIANJIN = "xianjin";
	public static final String POS = "pos";
	public static final String HUIYUANKA = "huiyuanka";
	public static final String FENQU = "fenqu";
	public static final String MIANDAN = "miandan";
	public static final String DAIJINQUAN = "daijinquan";
	public static final String CIKA = "cika";
	public static final String VDEF1 = "vdef1";
	public static final String VDEF2 = "vdef2";
	public static final String VDEF3 = "vdef3";
	public static final String VDEF4 = "vdef4";
	public static final String VDEF5 = "vdef5";

	/**
	 * 属性pk_hk_srgk_hg_hzshuju的Getter方法.属性名：主键 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_hk_srgk_hg_hzshuju() {
		return pk_hk_srgk_hg_hzshuju;
	}

	/**
	 * 属性pk_hk_srgk_hg_hzshuju的Setter方法.属性名：主键 创建日期:
	 * 
	 * @param newPk_hk_srgk_hg_hzshuju
	 *            java.lang.String
	 */
	public void setPk_hk_srgk_hg_hzshuju(
			java.lang.String newPk_hk_srgk_hg_hzshuju) {
		this.pk_hk_srgk_hg_hzshuju = newPk_hk_srgk_hg_hzshuju;
	}

	/**
	 * 属性pk_group的Getter方法.属性名：集团 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group() {
		return pk_group;
	}

	/**
	 * 属性pk_group的Setter方法.属性名：集团 创建日期:
	 * 
	 * @param newPk_group
	 *            java.lang.String
	 */
	public void setPk_group(java.lang.String newPk_group) {
		this.pk_group = newPk_group;
	}

	/**
	 * 属性pk_org的Getter方法.属性名：组织 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org() {
		return pk_org;
	}

	/**
	 * 属性pk_org的Setter方法.属性名：组织 创建日期:
	 * 
	 * @param newPk_org
	 *            java.lang.String
	 */
	public void setPk_org(java.lang.String newPk_org) {
		this.pk_org = newPk_org;
	}

	/**
	 * 属性pk_org_v的Getter方法.属性名：组织版本 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v() {
		return pk_org_v;
	}

	/**
	 * 属性pk_org_v的Setter方法.属性名：组织版本 创建日期:
	 * 
	 * @param newPk_org_v
	 *            java.lang.String
	 */
	public void setPk_org_v(java.lang.String newPk_org_v) {
		this.pk_org_v = newPk_org_v;
	}

	/**
	 * 属性pk_dept的Getter方法.属性名：部门 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_dept() {
		return pk_dept;
	}

	/**
	 * 属性pk_dept的Setter方法.属性名：部门 创建日期:
	 * 
	 * @param newPk_dept
	 *            java.lang.String
	 */
	public void setPk_dept(java.lang.String newPk_dept) {
		this.pk_dept = newPk_dept;
	}

	/**
	 * 属性pk_fdept的Getter方法.属性名：上级部门 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_fdept() {
		return pk_fdept;
	}

	/**
	 * 属性pk_fdept的Setter方法.属性名：上级部门 创建日期:
	 * 
	 * @param newPk_fdept
	 *            java.lang.String
	 */
	public void setPk_fdept(java.lang.String newPk_fdept) {
		this.pk_fdept = newPk_fdept;
	}

	/**
	 * 属性hzdate的Getter方法.属性名：汇总日期 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDate
	 */
	public nc.vo.pub.lang.UFDate getHzdate() {
		return hzdate;
	}

	/**
	 * 属性hzdate的Setter方法.属性名：汇总日期 创建日期:
	 * 
	 * @param newHzdate
	 *            nc.vo.pub.lang.UFDate
	 */
	public void setHzdate(nc.vo.pub.lang.UFDate newHzdate) {
		this.hzdate = newHzdate;
	}

	/**
	 * 属性pk_srxm的Getter方法.属性名：收入项目 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_srxm() {
		return pk_srxm;
	}

	/**
	 * 属性pk_srxm的Setter方法.属性名：收入项目 创建日期:
	 * 
	 * @param newPk_srxm
	 *            java.lang.String
	 */
	public void setPk_srxm(java.lang.String newPk_srxm) {
		this.pk_srxm = newPk_srxm;
	}

	/**
	 * 属性yingshou的Getter方法.属性名：应收 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getYingshou() {
		return yingshou;
	}

	/**
	 * 属性yingshou的Setter方法.属性名：应收 创建日期:
	 * 
	 * @param newYingshou
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setYingshou(nc.vo.pub.lang.UFDouble newYingshou) {
		this.yingshou = newYingshou;
	}

	/**
	 * 属性zdyh的Getter方法.属性名：自动优惠 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getZdyh() {
		return zdyh;
	}

	/**
	 * 属性zdyh的Setter方法.属性名：自动优惠 创建日期:
	 * 
	 * @param newZdyh
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setZdyh(nc.vo.pub.lang.UFDouble newZdyh) {
		this.zdyh = newZdyh;
	}

	/**
	 * 属性sgyh的Getter方法.属性名：手工优惠 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getSgyh() {
		return sgyh;
	}

	/**
	 * 属性sgyh的Setter方法.属性名：手工优惠 创建日期:
	 * 
	 * @param newSgyh
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setSgyh(nc.vo.pub.lang.UFDouble newSgyh) {
		this.sgyh = newSgyh;
	}

	/**
	 * 属性shishou的Getter方法.属性名：实收 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getShishou() {
		return shishou;
	}

	/**
	 * 属性shishou的Setter方法.属性名：实收 创建日期:
	 * 
	 * @param newShishou
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setShishou(nc.vo.pub.lang.UFDouble newShishou) {
		this.shishou = newShishou;
	}

	/**
	 * 属性kblyh的Getter方法.属性名：卡比例优惠 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getKblyh() {
		return kblyh;
	}

	/**
	 * 属性kblyh的Setter方法.属性名：卡比例优惠 创建日期:
	 * 
	 * @param newKblyh
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setKblyh(nc.vo.pub.lang.UFDouble newKblyh) {
		this.kblyh = newKblyh;
	}

	/**
	 * 属性qrsr的Getter方法.属性名：确认收入 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getQrsr() {
		return qrsr;
	}

	/**
	 * 属性qrsr的Setter方法.属性名：确认收入 创建日期:
	 * 
	 * @param newQrsr
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setQrsr(nc.vo.pub.lang.UFDouble newQrsr) {
		this.qrsr = newQrsr;
	}

	/**
	 * 属性xianjin的Getter方法.属性名：现金 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getXianjin() {
		return xianjin;
	}

	/**
	 * 属性xianjin的Setter方法.属性名：现金 创建日期:
	 * 
	 * @param newXianjin
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setXianjin(nc.vo.pub.lang.UFDouble newXianjin) {
		this.xianjin = newXianjin;
	}

	/**
	 * 属性pos的Getter方法.属性名：POS 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getPos() {
		return pos;
	}

	/**
	 * 属性pos的Setter方法.属性名：POS 创建日期:
	 * 
	 * @param newPos
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setPos(nc.vo.pub.lang.UFDouble newPos) {
		this.pos = newPos;
	}

	/**
	 * 属性huiyuanka的Getter方法.属性名：会员卡 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getHuiyuanka() {
		return huiyuanka;
	}

	/**
	 * 属性huiyuanka的Setter方法.属性名：会员卡 创建日期:
	 * 
	 * @param newHuiyuanka
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setHuiyuanka(nc.vo.pub.lang.UFDouble newHuiyuanka) {
		this.huiyuanka = newHuiyuanka;
	}

	/**
	 * 属性fenqu的Getter方法.属性名：分区金额 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public nc.vo.pub.lang.UFDouble getFenqu() {
		return fenqu;
	}

	/**
	 * 属性fenqu的Setter方法.属性名：分区金额 创建日期:
	 * 
	 * @param newFenqu
	 *            java.lang.String
	 */
	public void setFenqu(nc.vo.pub.lang.UFDouble newFenqu) {
		this.fenqu = newFenqu;
	}

	/**
	 * 属性miandan的Getter方法.属性名：免单 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public nc.vo.pub.lang.UFDouble getMiandan() {
		return miandan;
	}

	/**
	 * 属性miandan的Setter方法.属性名：免单 创建日期:
	 * 
	 * @param newMiandan
	 *            java.lang.String
	 */
	public void setMiandan(nc.vo.pub.lang.UFDouble newMiandan) {
		this.miandan = newMiandan;
	}

	/**
	 * 属性daijinquan的Getter方法.属性名：代金劵 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public nc.vo.pub.lang.UFDouble getDaijinquan() {
		return daijinquan;
	}

	/**
	 * 属性daijinquan的Setter方法.属性名：代金劵 创建日期:
	 * 
	 * @param newDaijinquan
	 *            java.lang.String
	 */
	public void setDaijinquan(nc.vo.pub.lang.UFDouble newDaijinquan) {
		this.daijinquan = newDaijinquan;
	}

	/**
	 * 属性cika的Getter方法.属性名：次卡 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public nc.vo.pub.lang.UFDouble getCika() {
		return cika;
	}

	/**
	 * 属性cika的Setter方法.属性名：次卡 创建日期:
	 * 
	 * @param newCika
	 *            java.lang.String
	 */
	public void setCika(nc.vo.pub.lang.UFDouble newCika) {
		this.cika = newCika;
	}

	/**
	 * 属性vdef1的Getter方法.属性名：自定义1 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getVdef1() {
		return vdef1;
	}

	/**
	 * 属性vdef1的Setter方法.属性名：自定义1 创建日期:
	 * 
	 * @param newVdef1
	 *            java.lang.String
	 */
	public void setVdef1(java.lang.String newVdef1) {
		this.vdef1 = newVdef1;
	}

	/**
	 * 属性vdef2的Getter方法.属性名：自定义2 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getVdef2() {
		return vdef2;
	}

	/**
	 * 属性vdef2的Setter方法.属性名：自定义2 创建日期:
	 * 
	 * @param newVdef2
	 *            java.lang.String
	 */
	public void setVdef2(java.lang.String newVdef2) {
		this.vdef2 = newVdef2;
	}

	/**
	 * 属性vdef3的Getter方法.属性名：自定义3 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getVdef3() {
		return vdef3;
	}

	/**
	 * 属性vdef3的Setter方法.属性名：自定义3 创建日期:
	 * 
	 * @param newVdef3
	 *            java.lang.String
	 */
	public void setVdef3(java.lang.String newVdef3) {
		this.vdef3 = newVdef3;
	}

	/**
	 * 属性vdef4的Getter方法.属性名：自定义4 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getVdef4() {
		return vdef4;
	}

	/**
	 * 属性vdef4的Setter方法.属性名：自定义4 创建日期:
	 * 
	 * @param newVdef4
	 *            java.lang.String
	 */
	public void setVdef4(java.lang.String newVdef4) {
		this.vdef4 = newVdef4;
	}

	/**
	 * 属性vdef5的Getter方法.属性名：自定义5 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getVdef5() {
		return vdef5;
	}

	/**
	 * 属性vdef5的Setter方法.属性名：自定义5 创建日期:
	 * 
	 * @param newVdef5
	 *            java.lang.String
	 */
	public void setVdef5(java.lang.String newVdef5) {
		this.vdef5 = newVdef5;
	}

	/**
	 * 属性dr的Getter方法.属性名：dr 创建日期:
	 * 
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr() {
		return dr;
	}

	/**
	 * 属性dr的Setter方法.属性名：dr 创建日期:
	 * 
	 * @param newDr
	 *            java.lang.Integer
	 */
	public void setDr(java.lang.Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * 属性ts的Getter方法.属性名：ts 创建日期:
	 * 
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs() {
		return ts;
	}

	/**
	 * 属性ts的Setter方法.属性名：ts 创建日期:
	 * 
	 * @param newTs
	 *            nc.vo.pub.lang.UFDateTime
	 */
	public void setTs(nc.vo.pub.lang.UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * <p>
	 * 取得父VO主键字段.
	 * <p>
	 * 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return null;
	}

	/**
	 * <p>
	 * 取得表主键.
	 * <p>
	 * 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_hk_srgk_hg_hzshuju";
	}

	/**
	 * <p>
	 * 返回表名称.
	 * <p>
	 * 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "hk_srgk_hg_hzshuju";
	}

	/**
	 * <p>
	 * 返回表名称.
	 * <p>
	 * 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "hk_srgk_hg_hzshuju";
	}

	/**
	 * 按照默认方式创建构造子.
	 * 
	 * 创建日期:
	 */
	public HZShuJuVO() {
		super();
	}

	@nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.hkjt.srgk.huiguan.hzshuju.HZShuJuVO")
	public IVOMeta getMetaData() {
		return null;
	}
}
