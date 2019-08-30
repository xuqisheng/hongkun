package nc.vo.hkjt.huiyuan.kaipiaoinfo;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.hkjt.huiyuan.kaipiaoinfo.KaipiaoinfoHVO")
public class KaipiaoinfoBillVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(KaipiaoinfoBillVOMeta.class);
    return billMeta;
  }

  @Override
  public KaipiaoinfoHVO getParentVO() {
    return (KaipiaoinfoHVO) this.getParent();
  }
}