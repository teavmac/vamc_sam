package com.teavamc.vamcsam.practice.designmode.abstractfactory.settle;

import com.teavamc.vamcsam.practice.designmode.abstractfactory.AbstractThreatFactory;
import com.teavamc.vamcsam.practice.designmode.abstractfactory.enums.SettleTypeEnum;
import com.teavamc.vamcsam.practice.designmode.abstractfactory.order.OrderHandle;
import org.apache.commons.lang3.StringUtils;

/**
 * @author 墨诚 mocheng@byai.com
 * @Package com.teavamc.vamcsam.practice.dp.abstractfactory
 * @date 2020/10/29 10:01
 */
public class SettleFactory extends AbstractThreatFactory {

    @Override
    public OrderHandle getOrder(String orderType) {
        return null;
    }

    @Override
    public SettleHandle getSettle(String settleType) {
        if (StringUtils.isBlank(settleType)){
            return null;
        }
        if (SettleTypeEnum.Online.name().equals(settleType)){
            return new OnlineSettleHandle();
        }else if (SettleTypeEnum.Offline.name().equals(settleType)){
            return new OfflineSettleHandle();
        }
        return null;
    }
}
