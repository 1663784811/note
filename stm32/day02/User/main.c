#include "stm32f10x.h"

#include "bsp_led.h"
#include "bsp_exti.h"
#include "bsp_usart.h"


void Delay(uint32_t count);


int main(void){

	LED_GPIO_Config();
	
	EXTI_Key_Config();
	
	/*��ʼ��USART ����ģʽΪ 115200 8-N-1���жϽ���*/
  USART_Config();
	
	
	while(1){
		Usart_SendString( DEBUG_USARTx,"����һ�������жϽ��ջ���ʵ��\n");
		LED_G(OFF);
		Delay(0xFFFFFF);
		Usart_SendString( DEBUG_USARTx,"����һ�������жϽ��ջ���ʵ��\n");
	  LED_G(ON);
		Delay(0xFFFFFF);
	}
}

void Delay(uint32_t count){
	for(;count!=0;count--);
}


