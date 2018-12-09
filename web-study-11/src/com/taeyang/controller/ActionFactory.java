package com.taeyang.controller;

import com.taeyang.controller.action.Action;
import com.taeyang.controller.action.BoardCheckPassAction;
import com.taeyang.controller.action.BoardCheckPassFormAction;
import com.taeyang.controller.action.BoardDeleteAction;
import com.taeyang.controller.action.BoardListAction;
import com.taeyang.controller.action.BoardUpdateAction;
import com.taeyang.controller.action.BoardUpdateFormAction;
import com.taeyang.controller.action.BoardViewAction;
import com.taeyang.controller.action.BoardWriteAction;
import com.taeyang.controller.action.BoardWriteFormAction;

public class ActionFactory {
	//명령 처리 클래스
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {

	}

	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : "+command);
		
		if(command.equals("board_list")) {
			action = new BoardListAction();
		}else if(command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		}else if(command.equals("board_write")) {
			action = new BoardWriteAction();
		}else if(command.equals("board_view")) {
			action = new BoardViewAction();
		}else if(command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		}else if(command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
		}else if(command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		}else if(command.equals("board_update")) {
			action = new BoardUpdateAction();
		}else if(command.equals("board_delete")) {
			action = new BoardDeleteAction();
		}
		return action;
	}
}
