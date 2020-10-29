package com.teavamc.vamcsam.service.practice.dp.abstractfactory.settle;

import com.teavamc.vamcsam.service.practice.tools.PrintTools;

/**
 * @author 墨诚 mocheng@byai.com
 * @Package com.teavamc.vamcsam.service.practice.dp.abstractfactory
 * @date 2020/10/29 09:42
 */
public class OnlineSettleHandle implements SettleHandle{
    @Override
    public void doSettle() {
        PrintTools.printInfo("线上结算");
    }
}
