/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIHandlerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIHandlerPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceEndpointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceEndpointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceEndpointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceFaultInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceInSequenceInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceOutSequenceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.APIResourcePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AbstractCommonTargetPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AddressEndPointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AddressEndPointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AddressEndPointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AddressingEndpointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AddressingEndpointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AddressingEndpointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AggregateMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AggregateMediatorOnCompleteOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AggregateMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AggregateMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AutoscaleInMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.AutoscaleOutMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BAMMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BAMMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BAMMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BeanMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BeanMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BeanMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BuilderMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BuilderMediatorOutputConectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.BuilderMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CacheMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CacheMediatorOnHitOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CacheMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CacheMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallMediatorEndpointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallTemplateMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallTemplateMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallTemplateMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CallTemplateParameterPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CalloutMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CalloutMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CalloutMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ClassMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ClassMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ClassMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ClassPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloneMediatorContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloneMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloneMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloneMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloneMediatorTargetOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloneTargetContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloneTargetPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloudConnectorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloudConnectorOperationInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloudConnectorOperationOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloudConnectorOperationPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloudConnectorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CloudConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CommandMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CommandMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CommandMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CommandPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.CommentMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ComplexEndpointsOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ComplexEndpointsPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ConditionalRouteBranchPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ConditionalRouterMediatorAdditionalOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ConditionalRouterMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ConditionalRouterMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ConditionalRouterMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DBLookupMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DBLookupMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DBLookupMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DBReportMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DBReportMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DBReportMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DataMapperMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DataMapperMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DataMapperMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DefaultEndPointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DefaultEndPointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DefaultEndPointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DropMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.DropMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EJBMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EJBMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EJBMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EndPointPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EndpointDiagramPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EndpointFlowPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EnqueueMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EnqueueMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EnqueueMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EnrichMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EnrichMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EnrichMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementAdviceContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementMediatorAdviceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementMediatorObligationsOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementMediatorOnAcceptOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementMediatorOnRejectOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementObligationsContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementOnAcceptContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EntitlementOnRejectContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbDiagramPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbLinkPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbSequenceInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbSequenceInputPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbSequenceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbSequenceOutputPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbSequencePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EsbServerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EvaluatorExpressionPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EventMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EventMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.EventMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FailoverEndPointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FailoverEndPointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FailoverEndPointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FailoverEndPointWestOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FastXSLTMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FastXSLTMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FastXSLTMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FaultMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FaultMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FaultMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterFailContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterMediatorFailOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterMediatorPassOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.FilterPassContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ForEachMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ForEachMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ForEachMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ForEachMediatorTargetOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ForEachTargetPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.HTTPEndPointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.HTTPEndPointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.HTTPEndpointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.HeaderMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.HeaderMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.HeaderMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointOnErrorSequenceContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointOnErrorSequenceInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointOnErrorSequenceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointParameterPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointSequenceContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointSequenceInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.InboundEndpointSequenceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.IterateMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.IterateMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.IterateMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.IterateMediatorTargetOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.IterateTargetPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LoadBalanceEndPointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LoadBalanceEndPointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LoadBalanceEndPointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LoadBalanceEndPointWestOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LocalEntryPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LogMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LogMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LogMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LogPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LoopBackMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LoopBackMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.LoopBackMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MediatorFlowPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MediatorSequencePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MemberPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MergeNodeFirstInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MergeNodeOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MergeNodePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MergeNodeSecondInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageBuilderPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageProcessorParameterPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageProcessorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageStoreParameterPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MessageStorePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.MethodArgumentPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.NameValueTypePropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.NamedEndpointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.NamedEndpointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.NamedEndpointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.NamespacedPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.OAuthMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.OAuthMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.OAuthMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ParentEndPointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PayloadFactoryArgumentPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PayloadFactoryMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PayloadFactoryMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PayloadFactoryMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PropertyMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PropertyMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PropertyMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyFaultInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyInSequenceInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyOutSequenceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyServiceContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyServiceFaultContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyServiceParameterPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyServicePolicyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyServicePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyServiceSequenceAndEndpointContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ProxyWSDLResourcePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PublishEventMediatorAttributePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PublishEventMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PublishEventMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.PublishEventMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RMSequenceMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RMSequenceMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RMSequenceMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RecipientListEndPointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RecipientListEndPointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RecipientListEndPointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RecipientListEndPointWestOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RegistryKeyPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RespondMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RespondMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RespondMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterMediatorContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterMediatorTargetOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterRoutePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterTargetContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RouterTargetPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleFactPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleFactsConfigurationPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleMediatorChildMediatorsOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleResultPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleResultsConfigurationPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleSessionPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.RuleSetCreationPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ScriptMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ScriptMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ScriptMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SendContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SendMediatorEndpointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SendMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SendMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SendMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SequenceDiagramPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SequenceInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SequenceOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SequencePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SequencesInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SequencesOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SequencesPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SessionPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SmooksMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SmooksMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SmooksMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SpringMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SpringMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SpringMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SqlParameterDefinitionPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SqlResultMappingPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SqlStatementPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.StoreMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.StoreMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.StoreMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchCaseBranchOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchCaseContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchCaseParentContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchDefaultBranchOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchDefaultContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchDefaultParentContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchMediatorContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SwitchMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.SynapseAPIPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TaskPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TaskPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TemplateEndpointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TemplateEndpointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TemplateEndpointParameterPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TemplateEndpointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TemplateParameterPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TemplatePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleMediatorOnAcceptOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleMediatorOnRejectOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleOnAcceptBranchPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleOnAcceptContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleOnRejectBranchPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottleOnRejectContainerPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottlePolicyConfigurationPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ThrottlePolicyEntryPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TransactionMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TransactionMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.TransactionMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.URLRewriteMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.URLRewriteMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.URLRewriteMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.URLRewriteRuleActionPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.URLRewriteRulePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ValidateFeaturePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ValidateMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ValidateMediatorOnFailOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ValidateMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ValidateMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ValidateResourcePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.ValidateSchemaPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.WSDLEndPointInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.WSDLEndPointOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.WSDLEndPointPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XQueryMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XQueryMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XQueryMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XQueryVariablePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XSLTFeaturePropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XSLTMediatorInputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XSLTMediatorOutputConnectorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XSLTMediatorPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XSLTPropertyPropertiesEditionPartForm;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.forms.XSLTResourcePropertiesEditionPartForm;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIHandlerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIHandlerPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceEndpointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceEndpointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceEndpointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceFaultInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceInSequenceInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceOutSequenceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.APIResourcePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AbstractCommonTargetPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AddressEndPointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AddressEndPointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AddressEndPointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AddressingEndpointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AddressingEndpointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AddressingEndpointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AggregateMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AggregateMediatorOnCompleteOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AggregateMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AggregateMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AutoscaleInMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.AutoscaleOutMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BAMMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BAMMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BAMMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BeanMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BeanMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BeanMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BuilderMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BuilderMediatorOutputConectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.BuilderMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CacheMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CacheMediatorOnHitOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CacheMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CacheMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallMediatorEndpointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallTemplateMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallTemplateMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallTemplateMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CallTemplateParameterPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CalloutMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CalloutMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CalloutMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ClassMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ClassMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ClassMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ClassPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloneMediatorContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloneMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloneMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloneMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloneMediatorTargetOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloneTargetContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloneTargetPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloudConnectorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloudConnectorOperationInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloudConnectorOperationOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloudConnectorOperationPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloudConnectorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CloudConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CommandMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CommandMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CommandMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CommandPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.CommentMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ComplexEndpointsOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ComplexEndpointsPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ConditionalRouteBranchPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ConditionalRouterMediatorAdditionalOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ConditionalRouterMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ConditionalRouterMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ConditionalRouterMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DBLookupMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DBLookupMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DBLookupMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DBReportMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DBReportMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DBReportMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DataMapperMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DataMapperMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DataMapperMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DefaultEndPointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DefaultEndPointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DefaultEndPointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DropMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.DropMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EJBMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EJBMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EJBMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EndPointPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EndpointDiagramPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EndpointFlowPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EnqueueMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EnqueueMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EnqueueMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EnrichMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EnrichMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EnrichMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementAdviceContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementMediatorAdviceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementMediatorObligationsOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementMediatorOnAcceptOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementMediatorOnRejectOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementObligationsContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementOnAcceptContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EntitlementOnRejectContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbDiagramPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbLinkPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbSequenceInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbSequenceInputPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbSequenceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbSequenceOutputPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbSequencePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EsbServerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EvaluatorExpressionPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EventMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EventMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.EventMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FailoverEndPointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FailoverEndPointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FailoverEndPointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FailoverEndPointWestOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FastXSLTMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FastXSLTMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FastXSLTMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FaultMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FaultMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FaultMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterFailContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterMediatorFailOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterMediatorPassOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.FilterPassContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ForEachMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ForEachMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ForEachMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ForEachMediatorTargetOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ForEachTargetPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.HTTPEndPointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.HTTPEndPointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.HTTPEndpointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.HeaderMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.HeaderMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.HeaderMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointOnErrorSequenceContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointOnErrorSequenceInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointOnErrorSequenceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointParameterPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointSequenceContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointSequenceInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.InboundEndpointSequenceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.IterateMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.IterateMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.IterateMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.IterateMediatorTargetOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.IterateTargetPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LoadBalanceEndPointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LoadBalanceEndPointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LoadBalanceEndPointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LoadBalanceEndPointWestOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LocalEntryPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LogMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LogMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LogMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LogPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LoopBackMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LoopBackMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.LoopBackMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MediatorFlowPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MediatorSequencePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MemberPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MergeNodeFirstInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MergeNodeOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MergeNodePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MergeNodeSecondInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageBuilderPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageProcessorParameterPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageProcessorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageStoreParameterPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MessageStorePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.MethodArgumentPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.NameValueTypePropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.NamedEndpointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.NamedEndpointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.NamedEndpointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.NamespacedPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.OAuthMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.OAuthMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.OAuthMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ParentEndPointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PayloadFactoryArgumentPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PayloadFactoryMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PayloadFactoryMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PayloadFactoryMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PropertyMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PropertyMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PropertyMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyFaultInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyInSequenceInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyOutSequenceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyServiceContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyServiceFaultContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyServiceParameterPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyServicePolicyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyServicePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyServiceSequenceAndEndpointContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ProxyWSDLResourcePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PublishEventMediatorAttributePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PublishEventMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PublishEventMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.PublishEventMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RMSequenceMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RMSequenceMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RMSequenceMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RecipientListEndPointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RecipientListEndPointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RecipientListEndPointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RecipientListEndPointWestOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RegistryKeyPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RespondMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RespondMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RespondMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterMediatorContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterMediatorTargetOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterRoutePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterTargetContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RouterTargetPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleFactPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleFactsConfigurationPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleMediatorChildMediatorsOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleResultPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleResultsConfigurationPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleSessionPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.RuleSetCreationPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ScriptMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ScriptMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ScriptMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SendContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SendMediatorEndpointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SendMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SendMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SendMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SequenceDiagramPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SequenceInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SequenceOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SequencePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SequencesInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SequencesOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SequencesPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SessionPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SmooksMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SmooksMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SmooksMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SpringMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SpringMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SpringMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SqlParameterDefinitionPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SqlResultMappingPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SqlStatementPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.StoreMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.StoreMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.StoreMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchCaseBranchOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchCaseContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchCaseParentContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchDefaultBranchOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchDefaultContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchDefaultParentContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchMediatorContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SwitchMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.SynapseAPIPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TaskPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TaskPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TemplateEndpointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TemplateEndpointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TemplateEndpointParameterPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TemplateEndpointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TemplateParameterPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TemplatePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleMediatorOnAcceptOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleMediatorOnRejectOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleOnAcceptBranchPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleOnAcceptContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleOnRejectBranchPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottleOnRejectContainerPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottlePolicyConfigurationPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ThrottlePolicyEntryPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TransactionMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TransactionMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.TransactionMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.URLRewriteMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.URLRewriteMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.URLRewriteMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.URLRewriteRuleActionPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.URLRewriteRulePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ValidateFeaturePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ValidateMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ValidateMediatorOnFailOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ValidateMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ValidateMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ValidateResourcePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.ValidateSchemaPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.WSDLEndPointInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.WSDLEndPointOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.WSDLEndPointPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XQueryMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XQueryMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XQueryMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XQueryVariablePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XSLTFeaturePropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XSLTMediatorInputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XSLTMediatorOutputConnectorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XSLTMediatorPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XSLTPropertyPropertiesEditionPartImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.impl.XSLTResourcePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class EsbPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EsbViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == EsbViewsRepository.EsbDiagram.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbDiagramPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbDiagramPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EsbServer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbServerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbServerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EsbLink.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbLinkPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbLinkPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallMediatorEndpointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallMediatorEndpointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallMediatorEndpointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EndPointProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EndPointPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EndPointPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyService.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyServicePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyServicePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyOutSequenceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyOutSequenceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyOutSequenceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyInSequenceInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyInSequenceInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyInSequenceInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyWSDLResource.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyWSDLResourcePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyWSDLResourcePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyFaultInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyFaultInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyFaultInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyServiceParameter.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyServiceParameterPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyServiceParameterPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyServicePolicy.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyServicePolicyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyServicePolicyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyServiceSequenceAndEndpointContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyServiceSequenceAndEndpointContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyServiceSequenceAndEndpointContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyServiceFaultContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyServiceFaultContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyServiceFaultContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ProxyServiceContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ProxyServiceContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ProxyServiceContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MediatorFlow.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MediatorFlowPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MediatorFlowPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EndpointFlow.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EndpointFlowPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EndpointFlowPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DefaultEndPoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DefaultEndPointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DefaultEndPointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DefaultEndPointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DefaultEndPointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DefaultEndPointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DefaultEndPointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DefaultEndPointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DefaultEndPointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AddressEndPoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AddressEndPointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AddressEndPointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AddressEndPointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AddressEndPointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AddressEndPointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AddressEndPointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AddressEndPointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AddressEndPointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TemplateEndpoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TemplateEndpointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TemplateEndpointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TemplateEndpointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TemplateEndpointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TemplateEndpointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TemplateEndpointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TemplateEndpointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TemplateEndpointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TemplateEndpointParameter.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TemplateEndpointParameterPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TemplateEndpointParameterPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.HTTPEndpoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new HTTPEndpointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new HTTPEndpointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.HTTPEndPointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new HTTPEndPointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new HTTPEndPointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.HTTPEndPointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new HTTPEndPointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new HTTPEndPointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DropMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DropMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DropMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DropMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DropMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DropMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterPassContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterPassContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterPassContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterFailContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterFailContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterFailContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterMediatorPassOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterMediatorPassOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterMediatorPassOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FilterMediatorFailOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FilterMediatorFailOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FilterMediatorFailOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MergeNode.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MergeNodePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MergeNodePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MergeNodeFirstInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MergeNodeFirstInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MergeNodeFirstInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MergeNodeSecondInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MergeNodeSecondInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MergeNodeSecondInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MergeNodeOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MergeNodeOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MergeNodeOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LogMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LogMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LogMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LogMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LogMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LogMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LogMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LogMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LogMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LogProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LogPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LogPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PublishEventMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PublishEventMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PublishEventMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PublishEventMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PublishEventMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PublishEventMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PublishEventMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PublishEventMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PublishEventMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PublishEventMediatorAttribute.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PublishEventMediatorAttributePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PublishEventMediatorAttributePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BAMMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BAMMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BAMMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BAMMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BAMMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BAMMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BAMMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BAMMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BAMMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BeanMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BeanMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BeanMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BeanMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BeanMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BeanMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BeanMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BeanMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BeanMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EJBMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EJBMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EJBMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EJBMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EJBMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EJBMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EJBMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EJBMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EJBMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MethodArgument.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MethodArgumentPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MethodArgumentPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RegistryKeyProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RegistryKeyPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RegistryKeyPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PropertyMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PropertyMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PropertyMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PropertyMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PropertyMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PropertyMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PropertyMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PropertyMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PropertyMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.NamespacedProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new NamespacedPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new NamespacedPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EnrichMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EnrichMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EnrichMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EnrichMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EnrichMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EnrichMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EnrichMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EnrichMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EnrichMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XSLTMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XSLTMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XSLTMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XSLTProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XSLTPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XSLTPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XSLTFeature.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XSLTFeaturePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XSLTFeaturePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XSLTResource.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XSLTResourcePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XSLTResourcePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XSLTMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XSLTMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XSLTMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XSLTMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XSLTMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XSLTMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchCaseBranchOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchCaseBranchOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchCaseBranchOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchDefaultBranchOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchDefaultBranchOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchDefaultBranchOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchMediatorContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchMediatorContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchMediatorContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchCaseParentContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchCaseParentContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchCaseParentContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchDefaultParentContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchDefaultParentContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchDefaultParentContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchCaseContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchCaseContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchCaseContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SwitchDefaultContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SwitchDefaultContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SwitchDefaultContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SequenceDiagram.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SequenceDiagramPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SequenceDiagramPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EsbSequence.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbSequencePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbSequencePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EsbSequenceInput.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbSequenceInputPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbSequenceInputPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EsbSequenceOutput.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbSequenceOutputPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbSequenceOutputPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EsbSequenceInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbSequenceInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbSequenceInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EsbSequenceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EsbSequenceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EsbSequenceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.Sequence.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SequencePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SequencePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SequenceInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SequenceInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SequenceInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SequenceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SequenceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SequenceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EventMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EventMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EventMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EventMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EventMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EventMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EventMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EventMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EventMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementMediatorOnRejectOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementMediatorOnRejectOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementMediatorOnRejectOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementMediatorOnAcceptOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementMediatorOnAcceptOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementMediatorOnAcceptOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementMediatorAdviceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementMediatorAdviceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementMediatorAdviceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementMediatorObligationsOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementMediatorObligationsOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementMediatorObligationsOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementOnRejectContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementOnRejectContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementOnRejectContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementOnAcceptContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementOnAcceptContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementOnAcceptContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementAdviceContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementAdviceContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementAdviceContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EntitlementObligationsContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EntitlementObligationsContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EntitlementObligationsContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EnqueueMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EnqueueMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EnqueueMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EnqueueMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EnqueueMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EnqueueMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EnqueueMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EnqueueMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EnqueueMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ClassMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ClassMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ClassMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ClassMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ClassMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ClassMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ClassMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ClassMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ClassMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ClassProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ClassPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ClassPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SpringMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SpringMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SpringMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SpringMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SpringMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SpringMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SpringMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SpringMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SpringMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ScriptMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ScriptMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ScriptMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ScriptMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ScriptMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ScriptMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ScriptMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ScriptMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ScriptMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FaultMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FaultMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FaultMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FaultMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FaultMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FaultMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FaultMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FaultMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FaultMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AggregateMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AggregateMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AggregateMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AggregateMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AggregateMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AggregateMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AggregateMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AggregateMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AggregateMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AggregateMediatorOnCompleteOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AggregateMediatorOnCompleteOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AggregateMediatorOnCompleteOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterRoute.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterRoutePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterRoutePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterTarget.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterTargetPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterTargetPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterMediatorTargetOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterMediatorTargetOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterMediatorTargetOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterMediatorContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterMediatorContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterMediatorContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RouterTargetContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RouterTargetContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RouterTargetContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloneMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloneMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloneMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloneTarget.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloneTargetPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloneTargetPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloneMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloneMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloneMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloneMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloneMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloneMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloneMediatorTargetOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloneMediatorTargetOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloneMediatorTargetOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloneMediatorContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloneMediatorContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloneMediatorContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloneTargetContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloneTargetContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloneTargetContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ForEachMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ForEachMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ForEachMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ForEachMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ForEachMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ForEachMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ForEachMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ForEachMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ForEachMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ForEachMediatorTargetOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ForEachMediatorTargetOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ForEachMediatorTargetOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ForEachTarget.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ForEachTargetPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ForEachTargetPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.IterateMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new IterateMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new IterateMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.IterateMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new IterateMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new IterateMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.IterateMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new IterateMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new IterateMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.IterateMediatorTargetOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new IterateMediatorTargetOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new IterateMediatorTargetOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.IterateTarget.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new IterateTargetPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new IterateTargetPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AbstractCommonTarget.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AbstractCommonTargetPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AbstractCommonTargetPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MediatorSequence.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MediatorSequencePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MediatorSequencePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CacheMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CacheMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CacheMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CacheMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CacheMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CacheMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CacheMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CacheMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CacheMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CacheMediatorOnHitOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CacheMediatorOnHitOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CacheMediatorOnHitOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XQueryMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XQueryMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XQueryMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XQueryMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XQueryMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XQueryMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XQueryMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XQueryMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XQueryMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.XQueryVariable.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new XQueryVariablePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new XQueryVariablePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CalloutMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CalloutMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CalloutMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CalloutMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CalloutMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CalloutMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CalloutMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CalloutMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CalloutMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RMSequenceMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RMSequenceMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RMSequenceMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RMSequenceMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RMSequenceMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RMSequenceMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RMSequenceMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RMSequenceMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RMSequenceMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TransactionMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TransactionMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TransactionMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TransactionMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TransactionMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TransactionMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TransactionMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TransactionMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TransactionMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.OAuthMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new OAuthMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new OAuthMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.OAuthMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new OAuthMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new OAuthMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.OAuthMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new OAuthMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new OAuthMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AutoscaleInMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AutoscaleInMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AutoscaleInMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AutoscaleOutMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AutoscaleOutMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AutoscaleOutMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.HeaderMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new HeaderMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new HeaderMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.HeaderMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new HeaderMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new HeaderMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.HeaderMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new HeaderMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new HeaderMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleMediatorOnAcceptOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleMediatorOnAcceptOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleMediatorOnAcceptOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleMediatorOnRejectOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleMediatorOnRejectOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleMediatorOnRejectOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottlePolicyConfiguration.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottlePolicyConfigurationPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottlePolicyConfigurationPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottlePolicyEntry.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottlePolicyEntryPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottlePolicyEntryPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleOnAcceptBranch.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleOnAcceptBranchPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleOnAcceptBranchPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleOnRejectBranch.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleOnRejectBranchPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleOnRejectBranchPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleOnAcceptContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleOnAcceptContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleOnAcceptContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ThrottleOnRejectContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ThrottleOnRejectContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ThrottleOnRejectContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CommandMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CommandMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CommandMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CommandMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CommandMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CommandMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CommandMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CommandMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CommandMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CommandProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CommandPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CommandPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SqlStatement.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SqlStatementPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SqlStatementPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SqlParameterDefinition.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SqlParameterDefinitionPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SqlParameterDefinitionPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SqlResultMapping.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SqlResultMappingPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SqlResultMappingPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DBLookupMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DBLookupMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DBLookupMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DBLookupMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DBLookupMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DBLookupMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DBLookupMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DBLookupMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DBLookupMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DBReportMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DBReportMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DBReportMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DBReportMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DBReportMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DBReportMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DBReportMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DBReportMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DBReportMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleMediatorChildMediatorsOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleMediatorChildMediatorsOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleMediatorChildMediatorsOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleSetCreationProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleSetCreationPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleSetCreationPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleSessionProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleSessionPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleSessionPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleFactsConfiguration.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleFactsConfigurationPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleFactsConfigurationPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleFact.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleFactPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleFactPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleResultsConfiguration.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleResultsConfigurationPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleResultsConfigurationPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RuleResult.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RuleResultPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RuleResultPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallTemplateParameter.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallTemplateParameterPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallTemplateParameterPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallTemplateMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallTemplateMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallTemplateMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallTemplateMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallTemplateMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallTemplateMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CallTemplateMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CallTemplateMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CallTemplateMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LoopBackMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LoopBackMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LoopBackMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LoopBackMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LoopBackMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LoopBackMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LoopBackMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LoopBackMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LoopBackMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RespondMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RespondMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RespondMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RespondMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RespondMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RespondMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RespondMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RespondMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RespondMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SmooksMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SmooksMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SmooksMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SmooksMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SmooksMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SmooksMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SmooksMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SmooksMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SmooksMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.StoreMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new StoreMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new StoreMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.StoreMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new StoreMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new StoreMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.StoreMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new StoreMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new StoreMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BuilderMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BuilderMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BuilderMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BuilderMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BuilderMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BuilderMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.BuilderMediatorOutputConector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new BuilderMediatorOutputConectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new BuilderMediatorOutputConectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageBuilder.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageBuilderPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageBuilderPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PayloadFactoryMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PayloadFactoryMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PayloadFactoryMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PayloadFactoryMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PayloadFactoryMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PayloadFactoryMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PayloadFactoryMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PayloadFactoryMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PayloadFactoryMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.PayloadFactoryArgument.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new PayloadFactoryArgumentPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new PayloadFactoryArgumentPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ConditionalRouteBranch.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ConditionalRouteBranchPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ConditionalRouteBranchPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ConditionalRouterMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ConditionalRouterMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ConditionalRouterMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ConditionalRouterMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ConditionalRouterMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ConditionalRouterMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ConditionalRouterMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ConditionalRouterMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ConditionalRouterMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ConditionalRouterMediatorAdditionalOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ConditionalRouterMediatorAdditionalOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ConditionalRouterMediatorAdditionalOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SendMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SendMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SendMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SendContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SendContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SendContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SendMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SendMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SendMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SendMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SendMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SendMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SendMediatorEndpointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SendMediatorEndpointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SendMediatorEndpointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FailoverEndPoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FailoverEndPointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FailoverEndPointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FailoverEndPointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FailoverEndPointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FailoverEndPointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FailoverEndPointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FailoverEndPointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FailoverEndPointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FailoverEndPointWestOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FailoverEndPointWestOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FailoverEndPointWestOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ParentEndPoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ParentEndPointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ParentEndPointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.WSDLEndPoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new WSDLEndPointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new WSDLEndPointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.WSDLEndPointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new WSDLEndPointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new WSDLEndPointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.WSDLEndPointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new WSDLEndPointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new WSDLEndPointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LoadBalanceEndPoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LoadBalanceEndPointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LoadBalanceEndPointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.Member.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MemberPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MemberPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LoadBalanceEndPointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LoadBalanceEndPointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LoadBalanceEndPointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LoadBalanceEndPointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LoadBalanceEndPointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LoadBalanceEndPointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LoadBalanceEndPointWestOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LoadBalanceEndPointWestOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LoadBalanceEndPointWestOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.LocalEntry.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new LocalEntryPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new LocalEntryPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.Session.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SessionPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SessionPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.Sequences.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SequencesPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SequencesPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SequencesOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SequencesOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SequencesOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SequencesInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SequencesInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SequencesInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.URLRewriteRuleAction.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new URLRewriteRuleActionPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new URLRewriteRuleActionPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.URLRewriteRule.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new URLRewriteRulePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new URLRewriteRulePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.URLRewriteMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new URLRewriteMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new URLRewriteMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.URLRewriteMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new URLRewriteMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new URLRewriteMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.URLRewriteMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new URLRewriteMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new URLRewriteMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EvaluatorExpressionProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EvaluatorExpressionPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EvaluatorExpressionPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ValidateMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ValidateMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ValidateMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ValidateResource.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ValidateResourcePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ValidateResourcePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ValidateFeature.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ValidateFeaturePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ValidateFeaturePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ValidateSchema.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ValidateSchemaPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ValidateSchemaPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ValidateMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ValidateMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ValidateMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ValidateMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ValidateMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ValidateMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ValidateMediatorOnFailOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ValidateMediatorOnFailOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ValidateMediatorOnFailOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.EndpointDiagram.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new EndpointDiagramPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new EndpointDiagramPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.NamedEndpoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new NamedEndpointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new NamedEndpointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.NamedEndpointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new NamedEndpointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new NamedEndpointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.NamedEndpointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new NamedEndpointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new NamedEndpointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.Template.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TemplatePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TemplatePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TemplateParameter.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TemplateParameterPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TemplateParameterPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.Task.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TaskPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TaskPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.NameValueTypeProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new NameValueTypePropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new NameValueTypePropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.TaskProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new TaskPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new TaskPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.SynapseAPI.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new SynapseAPIPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new SynapseAPIPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResource.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourcePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourcePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceOutSequenceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceOutSequenceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceOutSequenceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceInSequenceInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceInSequenceInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceInSequenceInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceFaultInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceFaultInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceFaultInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceEndpoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceEndpointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceEndpointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceEndpointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceEndpointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceEndpointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIResourceEndpointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIResourceEndpointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIResourceEndpointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ComplexEndpoints.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ComplexEndpointsPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ComplexEndpointsPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.ComplexEndpointsOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new ComplexEndpointsOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new ComplexEndpointsOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AddressingEndpoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AddressingEndpointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AddressingEndpointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AddressingEndpointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AddressingEndpointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AddressingEndpointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.AddressingEndpointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new AddressingEndpointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new AddressingEndpointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RecipientListEndPoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RecipientListEndPointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RecipientListEndPointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RecipientListEndPointInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RecipientListEndPointInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RecipientListEndPointInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RecipientListEndPointOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RecipientListEndPointOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RecipientListEndPointOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.RecipientListEndPointWestOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new RecipientListEndPointWestOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new RecipientListEndPointWestOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageStoreParameter.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageStoreParameterPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageStoreParameterPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageStore.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageStorePropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageStorePropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageProcessorParameter.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageProcessorParameterPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageProcessorParameterPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.MessageProcessor.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new MessageProcessorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new MessageProcessorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIHandler.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIHandlerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIHandlerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.APIHandlerProperty.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new APIHandlerPropertyPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new APIHandlerPropertyPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloudConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloudConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloudConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloudConnectorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloudConnectorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloudConnectorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloudConnectorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloudConnectorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloudConnectorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloudConnectorOperation.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloudConnectorOperationPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloudConnectorOperationPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloudConnectorOperationInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloudConnectorOperationInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloudConnectorOperationInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CloudConnectorOperationOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CloudConnectorOperationOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CloudConnectorOperationOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DataMapperMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DataMapperMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DataMapperMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DataMapperMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DataMapperMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DataMapperMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.DataMapperMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new DataMapperMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new DataMapperMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FastXSLTMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FastXSLTMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FastXSLTMediatorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FastXSLTMediatorInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FastXSLTMediatorInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FastXSLTMediatorInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.FastXSLTMediatorOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new FastXSLTMediatorOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new FastXSLTMediatorOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpoint.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointParameter.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointParameterPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointParameterPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointSequenceContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointSequenceContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointSequenceContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointOnErrorSequenceContainer.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointOnErrorSequenceContainerPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointOnErrorSequenceContainerPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointSequenceInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointSequenceInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointSequenceInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointSequenceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointSequenceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointSequenceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointOnErrorSequenceOutputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointOnErrorSequenceOutputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointOnErrorSequenceOutputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.InboundEndpointOnErrorSequenceInputConnector.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new InboundEndpointOnErrorSequenceInputConnectorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new InboundEndpointOnErrorSequenceInputConnectorPropertiesEditionPartForm(component);
		}
		if (key == EsbViewsRepository.CommentMediator.class) {
			if (kind == EsbViewsRepository.SWT_KIND)
				return new CommentMediatorPropertiesEditionPartImpl(component);
			if (kind == EsbViewsRepository.FORM_KIND)
				return new CommentMediatorPropertiesEditionPartForm(component);
		}
		return null;
	}

}
