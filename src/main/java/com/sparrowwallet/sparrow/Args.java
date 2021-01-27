package com.sparrowwallet.sparrow;

import com.beust.jcommander.Parameter;
import com.sparrowwallet.drongo.Network;

public class Args {
    @Parameter(names = { "--dir", "-d" }, description = "Path to Sparrow-GRS home folder")
    public String dir;

    @Parameter(names = { "--network", "-n" }, description = "Network to use")
    public Network network;

    @Parameter(names = { "--help", "-h" }, description = "Show usage", help = true)
    public boolean help;
}
