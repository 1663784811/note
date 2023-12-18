#include "stm32f10x.h"

#include "bsp_led.h"
#include "bsp_exti.h"
#include "bsp_usart.h"


void Delay(uint32_t count);


int main(void){

	LED_GPIO_Config();
	
	EXTI_Key_Config();
	
	/*初始化USART 配置模式为 115200 8-N-1，中断接收*/
  USART_Config();
	
	
	while(1){
		Usart_SendString( DEBUG_USARTx,"这是一个串口中断接收回显实验\n");
		LED_G(OFF);
		Delay(0xFFFFFF);
		Usart_SendString( DEBUG_USARTx,"这是一个串口中断接收回显实验\n");
	  LED_G(ON);
		Delay(0xFFFFFF);
	}
}

void Delay(uint32_t count){
	for(;count!=0;count--);
}


