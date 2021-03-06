package com.teavamc.vamcsam.practice.designmode.chain;

import com.teavamc.vamcsam.practice.tools.commontools.PrintTools;

/**
 * @author 墨诚 mocheng@byai.com
 * @Package com.teavamc.vamcsam.practice.dp.chain
 * @date 2020/10/29 14:36
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        PrintTools.printInfo("Error Console::Logger: " + message);
    }
}
