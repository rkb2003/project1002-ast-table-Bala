package model;

public class ProgramElement {
   private String pkgName;
   private String className;
   private String methodName;
   private boolean isReturnVoid;
   private Integer parameterSize;
   private Integer startPos;

   public ProgramElement() {
   }

     
   public ProgramElement(String pkgName, String className, String methodName, boolean isReturnVoid, Integer parameterSize,
			Integer startPos) {
		super();
		this.pkgName = pkgName;
		this.className = className;
		this.methodName = methodName;
		this.isReturnVoid = isReturnVoid;
		this.parameterSize = parameterSize;
		this.startPos = startPos;
	}

   public String getPkgName() {
      return pkgName;
   }

   public void setPkgName(String pkgName) {
      this.pkgName = pkgName;
   }

   public String getClassName() {
      return className;
   }

   public void setClassName(String className) {
      this.className = className;
   }

   public String getMethodName() {
      return methodName;
   }

   public void setMethodName(String methodName) {
      this.methodName = methodName;
   }

   public boolean isReturnVoid() {
      return isReturnVoid;
   }

   public void setReturnVoid(boolean isReturnVoid) {
      this.isReturnVoid = isReturnVoid;
   }

   public Integer getParameterSize() {
      return parameterSize;
   }

   public void setParameterSize(Integer parameterSize) {
      this.parameterSize = parameterSize;
   }

   public Integer getStartPos() {
	return startPos;
}

public void setStartPos(Integer startPos) {
	this.startPos = startPos;
}

@Override
   public String toString() {
      return pkgName + "." + className + "." + methodName;
   }


}
