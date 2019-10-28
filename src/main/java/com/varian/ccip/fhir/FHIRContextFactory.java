//package com.varian.ccip.fhir;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import ca.uhn.fhir.context.FhirContext;
//import ca.uhn.fhir.parser.IParser;
//import ca.uhn.fhir.rest.client.api.IClientInterceptor;
//import ca.uhn.fhir.rest.client.api.IGenericClient;
//
//public class FHIRContextFactory {
//	protected static FHIRContextFactory instance;
//    protected FhirContext fhirContext = Stu3ContextHelper.getStu3Context();
//
//    protected IClientInterceptor tokenInterceptor;
//
//    protected List<IClientInterceptor> interceptorList = new ArrayList<>();
//
//    private FHIRContextFactory() {
//    }
//
//    /**
//     * Return FHIRContext Instance.<br>
//     *
//     * @return FHIRContext Instance
//     */
//    public static FHIRContextFactory getInstance() {
//        if (instance == null) {
//            instance = new FHIRContextFactory();
//        }
//        return instance;
//    }
//
//    /**
//     * Return XML Parser.<br>
//     *
//     * @return XML Parser
//     */
//    public IParser getXmlParser() {
//        return fhirContext.newXmlParser();
//    }
//
//    /**
//     * Set Configuration and Set FhirContext.<br>
//     *
//     * @param configuration Configuration
//     */
//    public void setConfiguration(Configuration configuration) {
//        this.configuration = configuration;
//
//        fhirContext.getRestfulClientFactory().setConnectTimeout(configuration.getFhirServerConfiguration().getFhirConnectionTimeout());
//        fhirContext.getRestfulClientFactory().setConnectionRequestTimeout(configuration.getFhirServerConfiguration().getFhirConnectionRequestTimeout());
//        fhirContext.getRestfulClientFactory().setSocketTimeout(configuration.getFhirServerConfiguration().getFhirSocketTimeout());
//    }
//
//    public FHIRContextFactory addInterceptor(IClientInterceptor interceptor) {
//        if (interceptor != null) interceptorList.add(interceptor);
//        return this;
//    }
//
//    public FHIRContextFactory registerAuthTokenInterceptor(IClientInterceptor interceptor) {
//        this.tokenInterceptor = interceptor;
//        return getInstance();
//    }
//
//    /**
//     * Return a New Restful Client.<br>
//     *
//     * @return Generic Client
//     */
//    public IGenericClient newRestfulGenericClient() {
//        IGenericClient client;
//        client = fhirContext.newRestfulGenericClient(configuration.getFhirApiUri());
//        for (IClientInterceptor interceptor : interceptorList) {
//            client.registerInterceptor(interceptor);
//        }
//        if (tokenInterceptor != null) {
//            client.registerInterceptor(tokenInterceptor);
//        }
//        UserContext userContext = UserContextHandler.get();
//        if (userContext != null) {
//            client.registerInterceptor(new BearerTokenAuthInterceptor(userContext.getLogin().getToken()));
//            log.debug("newRestfulGenericClient userName={} tockent={}", userContext.getLogin().getName(),
//                    userContext.getLogin().getToken());
//        } else {
//            log.error("Can not get userContext from ThreadLocal");
//        }
//        return client;
//    }
//}
