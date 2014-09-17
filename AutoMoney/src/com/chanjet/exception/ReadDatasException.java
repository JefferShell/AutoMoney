package com.chanjet.exception;

public class ReadDatasException extends Exception {
	/**
	 * @author Tao
	 * @date 2014/9/4
	 * @function ReadDatasException
	 */
	  private int code = 1000;
	  public ReadDatasException() {
	    super();
	  }
	  public ReadDatasException(String message, Throwable cause) {
	    super(message, cause);
	  }
	  public ReadDatasException(String message) {
	    super(message);
	  }
	  public ReadDatasException(Throwable cause) {
	    super(cause);
	  }
	  public int getCode() {
	    return code;
	  }
	  @Override
	  public String toString() {
	    return "code:"+code+super.toString();
	  }
	  @Override
	  public String getMessage() {
	    return "code:"+code+super.getMessage();
	  }
}
