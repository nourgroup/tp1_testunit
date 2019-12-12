package com.howtodoinjava.junit5.examples;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
// 1- defined tested package
@IncludeTags("development")
public class DevelopmentTests 
{
}
