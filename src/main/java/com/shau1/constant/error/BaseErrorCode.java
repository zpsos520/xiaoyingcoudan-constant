package com.shau1.constant.error;

public class BaseErrorCode
{
  public static enum BaseErrorEnum
    implements ErrorBaseEnum
  {
    E0_SUCCESS("0", "����ɹ�"),  E_1_FAIL_SYS("-1", "����ϵͳʧ��"),  E_2_FAIL_BIZ("-2", "����ҵ��ʧ��"),  E_3_UN_Login("-3", "�û�δ��¼"),  E_4_UN_Authc("-4", "��Ȩ�޷���"),  E_5_FAIL_Sign("-5", "ǩ����֤ʧ��"),  E10_Para_Error("10", "��������"),  E11_Para_Null("11", "����Ϊ��"),  E12_Vcode_Error("12", "��֤�����"),  E13_DB_Error("13", "���ݿ����"),  E14_SYS_Error("14", "ϵͳ����"),  E15_File_Error("15", "�ļ�����"),  E16_Data_NotExist("16", "���ݲ�����"),  E17_Data_ChangeError("17", "����ת������"),  E18_Property_Error("18", "Property�ļ��������"),  E19_Redis_Error("19", "Redis����"),  E20_Json_Error("20", "Json����"),  E21_Obj_NotExist("21", "���󲻴���"),  E22_ObjType_Error("22", "���ʹ���"),  E23_Cache_NotSupport("23", "��֧�ִ˻���"),  E24_Http_Error("24", "Http�������"),  E25_HttpResp_Error("25", "Http������Ϣ����"),  E26_XMLParser_Error("26", "XML��������");
    
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
    
    private BaseErrorEnum(String code, String msg)
    {
      this.code = code;
      this.msg = msg;
    }
  }
}
