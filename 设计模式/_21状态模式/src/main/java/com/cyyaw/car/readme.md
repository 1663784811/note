#状态模式

## 应用场景 （ 网约车打车 ）




司机与乘客 的关系可用一个订单好去绑定


##### 订单类型
    1.快车
    2.拼车
    3.顺风车



##### 司机状态
    状态：  离线  |  在线  |   准备接单   |   已接单  |   载客 

    动作：  接单 | (乘客、司机)取消订单 |  (乘客、司机)修改目的地




##### 乘客状态
    状态：  离线 | 在线 | 发起订单 | 已接单 | 已被接单 |  前往 |

    动作：  发起订单 | 完成订单 | (乘客、司机)取消订单 | (乘客、司机)修改目的地












