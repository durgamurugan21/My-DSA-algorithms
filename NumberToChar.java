class NumberToChar
{
	public static void main(String args[])
	{
		String input="1123";
		char letter[]={'/','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int count=0;
		String output="";
				switch(1)
				{
					case 1:///one digit-one word -1=a 1=a 2=b 3=c
					for(int j=0;j<input.length();j++)
					{
					char let=input.charAt(j);
					int no=Integer.parseInt(Character.toString(let));
					output=output+letter[no];
					}
					System.out.println(output);
					output="";
					case 2: //2 digt
					for(int j=0;j<input.length();)
					{  	String num="";
						for(int k=0;(k<2);k++)
						{  char let=input.charAt(j);
							num=num+let;
							j++;
						}
					int no=Integer.parseInt(num);
					if(no>25)
					{
						System.out.println("0");
					}
					else{output=output+letter[no];}

					}
					System.out.println(output);	
					output="";
					//break;
					case 3:
						int y;
						for(y=0;y<input.length();y++)
						{
							System.out.println("...y"+y);
							if(y%2==0)
							{
								//System.out.println("........."+y);
								char let=input.charAt(y);
								int no=Integer.parseInt(Character.toString(let));
								output=output+letter[no];
							}
							else if(y%2!=0)
							{
								//System.out.println("....else.."+y);
								String num="";
									for(int k=0;k<2;k++)
									{  char let=input.charAt(y);
										num=num+let; 
										//System.out.println("...y"+y);
										y++;
										if(y==input.length()-1)
										{
											y--;
											System.out.println("working");
										}
										System.out.println(".....y"+y);
									}	
									int no=Integer.parseInt(num);
									if(no>25)
									{
										System.out.print("0");
									}
									else
									{
										output=output+letter[no];
									}	
							}
							count++;	
							System.out.println(+count);
					}
					System.out.println(+y);
					System.out.print(output);
					break;
					}
							
		}
				
				
	}
			

		
	

