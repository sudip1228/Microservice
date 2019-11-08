package Zuul;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulLoggingFilter extends ZuulFilter{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//folllowings are the abstract method in ZukkFilter which need to be implemented here..@override annotation indicates all the abstract methods which need to be defined here.  
	@Override
	public boolean shouldFilter() {//this method determines whether this filter should be executed or not?true means we are executing this filter.
		return true;
	}

	@Override
	public Object run() {//this includes the real logic which we want to put before interception of micreoservice when microservice is called.
		HttpServletRequest request = 
				RequestContext.getCurrentContext().getRequest();//gives current http request
		logger.info("request -> {} request uri -> {}", 
				request, request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {//indicates three things.whether this filter should be executed before or after the request or you want to filter onnly error request.
		return "pre";//"pre" indicates filter request before execution ."post" indicates filter after execution."error" indicates filter only error request or exceptions.
	}

	@Override
	public int filterOrder() {//setting the priority order to filters.This class filter priority order is 1.
		return 1;
	}
}