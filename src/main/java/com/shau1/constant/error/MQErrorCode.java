package com.shau1.constant.error;

public class MQErrorCode
{
  public static enum MQErrorEnum
    implements ErrorBaseEnum
  {
    E70_Serialize("70", "����ת�������"),  E71_DeSerialize("71", "����ת�������"),  E72_DatacodecNot("72", "��֧�ֵĶ������"),  E73_MQShutdown("73", "MQ���ӹرմ���"),  E74_ConsumerConfig("74", "MQ���������ò�������"),  E75_ConsumerRegister("75", "MQ������ע�����"),  E76_ConsumerName("76", "MQ���������Ʋ���Ϊ��"),  E77_ConsumerConfigFile("77", "MQ�����ļ�����Ϊ��"),  E78_ConsumerProcess("78", "MQ���մ����߲���Ϊ��"),  E79_ConfigFile("79", "�����ļ����ش���"),  E80_SenderConfig("80", "MQ���������ò�������"),  E81_SenderInit("81", "MQ�����߳�ʼ������");
    
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
