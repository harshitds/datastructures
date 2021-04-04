package com.datastructure.stack;

import java.util.Stack;

public class BalancedParanthises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String isBalanced(String s)
	{
		Stack<Character> charstack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) =='{' || s.charAt(i) =='('  ||s.charAt(i) =='['  )
			{
				charstack.push(s.charAt(i));
			}
			else {
				if(charstack.isEmpty())
				{
					return "NO";
				}
				else {
					char closebrackts=charstack.pop();
					if(s.charAt(i)==')' && closebrackts!='(')
					{
						return "NO";
					}
					else if(s.charAt(i)=='}' && closebrackts!='{')
					{
						return "NO";
					}
					
					else if(s.charAt(i)==']' && closebrackts!='[')
					{
						return "NO";
					}
				}
			}
		}
		
		if(charstack.isEmpty())
		{
			return "YES";
		}
		else {
			return "NO";
		}
		
	}

}
