package simplecloud.system.gateway.filter;

import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * GlobalFilter处理一切进入网关的请求和响应，并且也是可以编写代码自定义逻辑；在执行顺序上，GatewayFilter先执行，GlobalFilter后执行
 * 权限拦截
 * /auth 开头的请求不需要权限
 *
 */
@Component
@Log4j2
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        if (!exchange.getRequest().getPath().value().startsWith("/api/auth")) {

        }
        return chain.filter(exchange);
    }
}
