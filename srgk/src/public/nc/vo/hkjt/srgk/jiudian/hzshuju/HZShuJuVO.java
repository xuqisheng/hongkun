/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.hkjt.srgk.jiudian.hzshuju;
	
import nc.vo.pub.*;
import nc.vo.pub.lang.UFDouble;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 *     在此处添加此类的描述信息
 * </p>
 * 创建日期:
 * @author 
 * @version NCPrj ??
 */
@SuppressWarnings("serial")
public class HZShuJuVO extends SuperVO {
	private java.lang.String pk_hk_srgk_jd_hzshuju;
	private java.lang.String pk_group;
	private java.lang.String pk_org;
	private java.lang.String pk_org_v;
	private java.lang.String pk_dept;
	private java.lang.String pk_fdept;
	private nc.vo.pub.lang.UFDate hzdate;
	private java.lang.String srxm_id;
	private java.lang.String jzfs_id;
	private java.lang.String khmz;
	private nc.vo.pub.lang.UFDouble payment;
	private nc.vo.pub.lang.UFDouble charge;
	private java.lang.Integer dr = 0;
	private nc.vo.pub.lang.UFDateTime ts;
	//后续增加
	private Integer uptype;
	private String vbillcode;
	private String vrowno;
	private String jzfs_name;
	private String iszd;//是否账单取数
	
	private String code;
	private String name;
	private String pk_parent;
	private UFDouble jine;
	private String xflx;
	
	private String lx_id;
	
	
	public String getIszd() {
		return iszd;
	}
	public void setIszd(String iszd) {
		this.iszd = iszd;
	}
	public String getLx_id() {
		return lx_id;
	}
	public void setLx_id(String lx_id) {
		this.lx_id = lx_id;
	}
	public String getXflx() {
		return xflx;
	}
	public void setXflx(String xflx) {
		this.xflx = xflx;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPk_parent() {
		return pk_parent;
	}
	public void setPk_parent(String pk_parent) {
		this.pk_parent = pk_parent;
	}
	public UFDouble getJine() {
		return jine;
	}
	public void setJine(UFDouble jine) {
		this.jine = jine;
	}
	public String getJzfs_name() {
		return jzfs_name;
	}
	public void setJzfs_name(String jzfs_name) {
		this.jzfs_name = jzfs_name;
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
	public Integer getUptype() {
		return uptype;
	}
	public void setUptype(Integer uptype) {
		this.uptype = uptype;
	}

	public static final String PK_HK_SRGK_JD_HZSHUJU = "pk_hk_srgk_jd_hzshuju";
	public static final String PK_GROUP = "pk_group";
	public static final String PK_ORG = "pk_org";
	public static final String PK_ORG_V = "pk_org_v";
	public static final String PK_DEPT = "pk_dept";
	public static final String PK_FDEPT = "pk_fdept";
	public static final String HZDATE = "hzdate";
	public static final String SRXM_ID = "srxm_id";
	public static final String JZFS_ID = "jzfs_id";
	public static final String KHMZ = "khmz";
	public static final String PAYMENT = "payment";
	public static final String CHARGE = "charge";
			
	/**
	 * 属性pk_hk_srgk_jd_hzshuju的Getter方法.属性名：主键
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_hk_srgk_jd_hzshuju () {
		return pk_hk_srgk_jd_hzshuju;
	}   
	/**
	 * 属性pk_hk_srgk_jd_hzshuju的Setter方法.属性名：主键
	 * 创建日期:
	 * @param newPk_hk_srgk_jd_hzshuju java.lang.String
	 */
	public void setPk_hk_srgk_jd_hzshuju (java.lang.String newPk_hk_srgk_jd_hzshuju ) {
	 	this.pk_hk_srgk_jd_hzshuju = newPk_hk_srgk_jd_hzshuju;
	} 	  
	/**
	 * 属性pk_group的Getter方法.属性名：集团
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}   
	/**
	 * 属性pk_group的Setter方法.属性名：集团
	 * 创建日期:
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	  
	/**
	 * 属性pk_org的Getter方法.属性名：组织
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}   
	/**
	 * 属性pk_org的Setter方法.属性名：组织
	 * 创建日期:
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	  
	/**
	 * 属性pk_org_v的Getter方法.属性名：组织版本
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v () {
		return pk_org_v;
	}   
	/**
	 * 属性pk_org_v的Setter方法.属性名：组织版本
	 * 创建日期:
	 * @param newPk_org_v java.lang.String
	 */
	public void setPk_org_v (java.lang.String newPk_org_v ) {
	 	this.pk_org_v = newPk_org_v;
	} 	  
	/**
	 * 属性pk_dept的Getter方法.属性名：部门
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_dept () {
		return pk_dept;
	}   
	/**
	 * 属性pk_dept的Setter方法.属性名：部门
	 * 创建日期:
	 * @param newPk_dept java.lang.String
	 */
	public void setPk_dept (java.lang.String newPk_dept ) {
	 	this.pk_dept = newPk_dept;
	} 	  
	/**
	 * 属性pk_fdept的Getter方法.属性名：上级部门
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_fdept () {
		return pk_fdept;
	}   
	/**
	 * 属性pk_fdept的Setter方法.属性名：上级部门
	 * 创建日期:
	 * @param newPk_fdept java.lang.String
	 */
	public void setPk_fdept (java.lang.String newPk_fdept ) {
	 	this.pk_fdept = newPk_fdept;
	} 	  
	/**
	 * 属性hzdate的Getter方法.属性名：日期
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDate
	 */
	public nc.vo.pub.lang.UFDate getHzdate () {
		return hzdate;
	}   
	/**
	 * 属性hzdate的Setter方法.属性名：日期
	 * 创建日期:
	 * @param newHzdate nc.vo.pub.lang.UFDate
	 */
	public void setHzdate (nc.vo.pub.lang.UFDate newHzdate ) {
	 	this.hzdate = newHzdate;
	} 	  
	/**
	 * 属性srxm_id的Getter方法.属性名：收入项目
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getSrxm_id () {
		return srxm_id;
	}   
	/**
	 * 属性srxm_id的Setter方法.属性名：收入项目
	 * 创建日期:
	 * @param newSrxm_id java.lang.String
	 */
	public void setSrxm_id (java.lang.String newSrxm_id ) {
	 	this.srxm_id = newSrxm_id;
	} 	  
	/**
	 * 属性jzfs_id的Getter方法.属性名：结账方式
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getJzfs_id () {
		return jzfs_id;
	}   
	/**
	 * 属性jzfs_id的Setter方法.属性名：结账方式
	 * 创建日期:
	 * @param newJzfs_id java.lang.String
	 */
	public void setJzfs_id (java.lang.String newJzfs_id ) {
	 	this.jzfs_id = newJzfs_id;
	} 	  
	/**
	 * 属性khmz的Getter方法.属性名：客户名称
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getKhmz () {
		return khmz;
	}   
	/**
	 * 属性khmz的Setter方法.属性名：客户名称
	 * 创建日期:
	 * @param newKhmz java.lang.String
	 */
	public void setKhmz (java.lang.String newKhmz ) {
	 	this.khmz = newKhmz;
	} 	  
	/**
	 * 属性payment的Getter方法.属性名：消费金额
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getPayment () {
		return payment;
	}   
	/**
	 * 属性payment的Setter方法.属性名：消费金额
	 * 创建日期:
	 * @param newPayment nc.vo.pub.lang.UFDouble
	 */
	public void setPayment (nc.vo.pub.lang.UFDouble newPayment ) {
	 	this.payment = newPayment;
	} 	  
	/**
	 * 属性charge的Getter方法.属性名：结账金额
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public nc.vo.pub.lang.UFDouble getCharge () {
		return charge;
	}   
	/**
	 * 属性charge的Setter方法.属性名：结账金额
	 * 创建日期:
	 * @param newCharge nc.vo.pub.lang.UFDouble
	 */
	public void setCharge (nc.vo.pub.lang.UFDouble newCharge ) {
	 	this.charge = newCharge;
	} 	  
	/**
	 * 属性dr的Getter方法.属性名：dr
	 * 创建日期:
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	  
	/**
	 * 属性ts的Getter方法.属性名：ts
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getTs () {
		return ts;
	}   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:
	 * @param newTs nc.vo.pub.lang.UFDateTime
	 */
	public void setTs (nc.vo.pub.lang.UFDateTime newTs ) {
	 	this.ts = newTs;
	} 	  
 
	/**
	  * <p>取得父VO主键字段.
	  * <p>
	  * 创建日期:
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	/**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	  return "pk_hk_srgk_jd_hzshuju";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "hk_srgk_jd_hzshuju";
	}    
	
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	public static java.lang.String getDefaultTableName() {
		return "hk_srgk_jd_hzshuju";
	}    
    
    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:
	  */
     public HZShuJuVO() {
		super();	
	}    
	
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.hkjt.srgk.jiudian.hzshuju.HZShuJuVO" )
	public IVOMeta getMetaData() {
   		return null;
  	}
} 


