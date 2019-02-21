import java.util.*;
public class Demo{
	public static void main(String[] args){
		//定义一个数组，存放系统随机生成的6个红色球，
		int[] sysRedBall = new int[6];
		//蓝色球
		int SysBlueBall = 0;

		//定义一个数组，玩家自己选择的6个红色球
		int[] playerRedBall = new int[6];
		//玩家自己的蓝色球
		int playerBlueBall = 0;
	
		//定义两个证书变量，一个存放正确的红球号码个数，一个存放正确的蓝球个数。

		int redCount = 0;
		int blueCount = 0;

		//数组：存放红球的池子，红球33个。
		int[] redBall = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
		
		//让系统自动生成对应的中奖号码
		//获取随机数
		Random r = new Random();
		//System.out.println(r.nextInt(33));//获取0到33之间的数字，包含0到32
		//int index = r.nextInt(33);

		for(int i =0; i <sysRedBall.length;i++){
			//数据不能重复
			int index = 0;
			while(true){
				index = r.nextInt(33);//返回一个随机数
				if(redBall[index] != -1){
					sysRedBall[i] = redBall[index];
					redBall[index] = -1;
					break;
				}
			}	
		}//从池子随机取出6个不重复的额数字

		SysBlueBall = r.nextInt(16)+1;
		//System.out.println(Arrays.toString(sysRedBall));



		//让玩家来选择双色球的号码
		//可以在控制台上，接受输入

		Scanner sc = new Scanner(System.in);//开启监听，监听键盘的动作
		System.out.println("请选择红球号码，在1到33之间选择6次，并不重复：");
		for(int i =0; i<playerRedBall.length; i ++){
			playerRedBall[i] = sc.nextInt();//捕获用户在键盘上输入的数字
		}
		System.out.println("请选择蓝球号码，在1到16之间：");
		playerBlueBall = sc.nextInt();


		//判断是否中奖：
		for(int i = 0; i < sysRedBall.length; i++){
			for(int j = 0; j < playerRedBall.length; j++){
				if(sysRedBall[i]==playerRedBall[j]){
					redCount++;
				}
			}
		
		}
		if (playerBlueBall == SysBlueBall){blueCount=1;};

		//显示中奖情况
		if(redCount ==6 && blueCount==1){System.out.println("恭喜你中了一等奖，奖金一千万");
		}else if(redCount ==6 && blueCount==0){System.out.println("恭喜你中了二等奖，奖金五百万");
		}else if(redCount ==5 && blueCount==1){System.out.println("恭喜你中了三等奖，奖金三千元");
		}else if((redCount ==5 && blueCount==0)||(redCount ==4 && blueCount==1)){
			System.out.println("恭喜你中了四等奖，奖金二百元");
			}else if((redCount ==4 && blueCount==0)||(redCount ==3 && blueCount==1)){
			System.out.println("恭喜你中了五等奖，奖金十元");
			}else if((redCount ==2 && blueCount==1)||(redCount ==1 && blueCount==1)||(redCount ==0 && blueCount==1)){
			System.out.println("恭喜你中了五等奖，奖金五元");
			}else{System.out.println("你丫真黑");}


		//输出所有号码
		System.out.println("本期开奖红球号码：" + Arrays.toString(sysRedBall) +"蓝球号码：" + SysBlueBall);
		System.out.println("您的红球号码：" + Arrays.toString(playerRedBall) + "您的蓝球号码：" + playerBlueBall);

	
  }
}
