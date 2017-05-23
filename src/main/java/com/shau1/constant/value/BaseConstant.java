package com.shau1.constant.value;

public class BaseConstant
{
  public static enum RowStatusEnum
  {
    ROW_Status_Y("0", "记录状态:有效"),  ROW_Status_N("1", "记录状态:无效");
    
    private String name;
    private String code;
    
    public String getCode()
    {
      return this.code;
    }
    
    public String getName()
    {
      return this.name;
    }
    
    private RowStatusEnum(String code, String name)
    {
      this.code = code;
      this.name = name;
    }
  }
  
  public static enum YNEnum
  {
    YES("1", "是"),  NO("0", "否");
    
    private String name;
    private String code;
    
    public String getCode()
    {
      return this.code;
    }
    
    public String getName()
    {
      return this.name;
    }
    
    private YNEnum(String code, String name)
    {
      this.code = code;
      this.name = name;
    }
  }
  
  public static enum CacheTypeEnum
  {
    Cache_Redis("Redis"),  Cache_Ehcache("Ehcache");
    
    private String type;
    
    private CacheTypeEnum(String type)
    {
      this.type = type;
    }
    
    public String getType()
    {
      return this.type;
    }
    
    public void setType(String type)
    {
      this.type = type;
    }
  }
}
