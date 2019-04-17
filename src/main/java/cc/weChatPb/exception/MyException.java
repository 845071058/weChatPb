//package cc.weChatPb.exception;
//
//import cc.weChatPb.enums.ResultEnum;
//
//public class MyException extends RuntimeException{
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private Integer code;
//
//    public MyException(Integer code, String msg) {
//        super(msg);
//        this.code = code;
//    }
//
//    public MyException(ResultEnum resultEnum) {
//        super(resultEnum.getMsg());
//        this.code = resultEnum.getCode();
//    }
//
//}
