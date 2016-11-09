package xyz.bpazy.models;

import com.beust.jcommander.Parameter;

/**
 * Created by Ziyuan.
 * 2016/11/9 17:25
 */
public class RunParameter {

    @Parameter(names = {"-p", "--proxy"}, description = "Proxy server. such as 127.0.0.1:8080")
    public String proxy;

    @Parameter(names = "--help", help = true)
    public boolean help;

    @Parameter(names = {"-o", "--out"}, description = "Output path.")
    public String file = "";
}
