package com.shau1.constant.error;

public class MQErrorCode
{
  public static enum MQErrorEnum
    implements ErrorBaseEnum
  {
    E70_Serialize("70", "对象转编码错误"),  E71_DeSerialize("71", "编码转对象错误"),  E72_DatacodecNot("72", "不支持的对象编码"),  E73_MQShutdown("73", "MQ连接关闭错误"),  E74_ConsumerConfig("74", "MQ消费者配置参数错误"),  E75_ConsumerRegister("75", "MQ消费者注册错误"),  E76_ConsumerName("76", "MQ消费者名称不能为空"),  E77_ConsumerConfigFile("77", "MQ配置文件不能为空"),  E78_ConsumerProcess("78", "MQ接收处理者不能为空"),  E79_ConfigFile("79", "配置文件加载错误"),  E80_SenderConfig("80", "MQ发送者配置参数错误"),  E81_SenderInit("81", "MQ发送者初始化错误");
    
    private String msg;
    private String code;
    
    public String getCode()
    {
      return this.code;
    }
    
    public String getMsg()
    {
      return this.msg;
    }
    
    private MQErrorEnum(String code, String msg)
    {
      this.code = code;
      this.msg = msg;
    }
  }
}
