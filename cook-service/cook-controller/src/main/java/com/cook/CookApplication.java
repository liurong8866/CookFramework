package com.cook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author cook studio
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CookApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CookApplication.class, args);

        System.out.println("                                                                                                           \n" +
                            "(♥◠‿◠)ﾉﾞ++++++++++++++++++++++++++++++++++  启动成功   ++++++++++++++++++++++++++++++++++ლ(´ڡ`ლ)ﾞ         \n" +
                            "       ______                  __            _____   __                __                                 \n" +
                            "      / ____/  ____   ____    / /__         / ___/  / /_  __  __  ____/ /   (_)  ____                     \n" +
                            "     / /      / __ \\ / __ \\  / //_/         \\__ \\  / __/ / / / / / __  /   / /  / __ \\               \n" +
                            "    / /___   / /_/ // /_/ / / , <          ___/ / / /_  / /_/ / / /_/ /   / /  / /_/ /                    \n" +
                            "    \\____/   \\____/ \\____/ /_/|_|         /____/  \\__/  \\__,_/  \\__,_/   /_/   \\____/              \n" +
                            "                                                                                                          \n" );



    }
}
