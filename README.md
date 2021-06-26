# design_pattern
##### 1.开闭原则，对修改关闭，对扩展开放：
存在接口ICourse，JavaCourse是其实现类，提供了三个方法，getId(),getName(),getPrice()  
假设现在要增加一个获取折扣价格的方法，如果在ICourse中增加，所有ICourse的实现类都要增加这个实现  
在JavaCourse类中增加也可以实现这个功能，同样的道理会对其子类产生影响，更好的方式是新增一个子类  
继承JavaCourse类，在子类中增加这个方法  