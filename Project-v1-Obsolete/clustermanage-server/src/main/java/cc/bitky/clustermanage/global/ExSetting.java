package cc.bitky.clustermanage.global;

public class ExSetting {
    //部署员工信息时，若数据库中无指定的相关信息，而部署的默认员工默认信息
    public String 员工默认卡号 = "";

    public String 员工默认姓名 = "备用";

    public String 员工默认部门 = "默认单位";

    //当剩余充电次数小于该阈值时，服务器下发剩余充电次数
    public int 部署剩余充电次数阈值 = 20;

    //服务器下发数据帧时，帧发送间隔「单位：ms」
    public int 帧发送间隔 = 60;

    //检错重发最大次数，服务器向 TCP 通道发送 CAN 帧，最大重复发送次数
    public int 检错重发最大重复次数 = 5;

    //新矿灯的初始化充电次数
    public int 初始充电次数 = 500;

    //数据库服务器的主机名或者IP地址
    public String 数据库服务器的主机名或IP = "localhost";
}
