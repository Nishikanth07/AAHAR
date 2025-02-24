package com.aahar.service;

import java.util.List;

import com.aahar.dtos.MenuItemReqDTO;
import com.aahar.dtos.MenuItemRespDTO;
import com.aahar.dtos.MenuItemUpdateRequest;
import com.aahar.dtos.NutritionalInfoDTO;
import com.aahar.pojos.MenuItem;
import com.aahar.pojos.MenuItem.MealType;
import com.aahar.pojos.WeeklyMenu;
import com.aahar.pojos.WeeklyMenu.DayOfWeek;

public interface MenuService {
	public List<MenuItemRespDTO> getWeeklyMenu(Long messOwnerId);
	
 	public MenuItemRespDTO addMenuItem(Long messOwnerId, String dishName, double price, WeeklyMenu.DayOfWeek dayOfWeek, MenuItem.MealType mealType);

    public void updateMenuItem(MenuItemUpdateRequest updateRequest);
    
//    public boolean deleteMenuItem(Long menuItemId);
    public boolean deleteMenuItem(Long menuItemId);
    



}
