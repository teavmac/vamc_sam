package com.teavamc.vamcsam.practice.designmode.chain;

import com.teavamc.vamcsam.practice.tools.commontools.PrintTools;

/**
 * @author 墨诚 mocheng@byai.com
 * @Package com.teavamc.vamcsam.practice.dp.chain
 * @date 2020/10/29 14:39
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        PrintTools.printInfo("File::Logger: "+ message);
    }
}
