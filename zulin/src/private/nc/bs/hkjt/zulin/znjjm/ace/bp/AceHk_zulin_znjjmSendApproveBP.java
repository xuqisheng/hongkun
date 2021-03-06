package nc.bs.hkjt.zulin.znjjm.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.hkjt.zulin.znjjm.ZnjjmBillVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据送审的BP
 */
public class AceHk_zulin_znjjmSendApproveBP {
	/**
	 * 送审动作
	 * 
	 * @param vos
	 *            单据VO数组
	 * @param script
	 *            单据动作脚本对象
	 * @return 送审后的单据VO数组
	 */

	public ZnjjmBillVO[] sendApprove(ZnjjmBillVO[] clientBills,
			ZnjjmBillVO[] originBills) {
		for (ZnjjmBillVO clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 数据持久化
		ZnjjmBillVO[] returnVos = new BillUpdate<ZnjjmBillVO>().update(
				clientBills, originBills);
		return returnVos;
	}
}
