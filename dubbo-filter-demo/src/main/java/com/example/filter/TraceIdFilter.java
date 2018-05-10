package com.example.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;

@Activate(group = { Constants.CONSUMER })
public class TraceIdFilter implements com.alibaba.dubbo.rpc.Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		// send the traceId to provider side.
		RpcContext.getContext().setAttachment("traceId", TraceId.get());
		return invoker.invoke(invocation);
	}

}
