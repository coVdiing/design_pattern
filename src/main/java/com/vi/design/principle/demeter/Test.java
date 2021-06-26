package com.vi.design.principle.demeter;

/**
 * @Author: vi
 * @Date: 2021-06-26 10:36
 * @Version: 1.0
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader );
    }
}
