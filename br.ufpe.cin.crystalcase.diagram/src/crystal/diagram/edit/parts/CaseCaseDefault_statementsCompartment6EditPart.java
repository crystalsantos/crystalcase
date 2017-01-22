/*
 * 
 */
package crystal.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import crystal.diagram.edit.policies.CaseCaseDefault_statementsCompartment6CanonicalEditPolicy;
import crystal.diagram.edit.policies.CaseCaseDefault_statementsCompartment6ItemSemanticEditPolicy;
import crystal.diagram.part.CrystalVisualIDRegistry;
import crystal.diagram.part.Messages;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class CaseCaseDefault_statementsCompartment6EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7149;

	/**
	* @generated
	*/
	public CaseCaseDefault_statementsCompartment6EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.CaseCaseDefault_statementsCompartment6EditPart_title;
	}

	/**
	 * @generated not
	 * Crystal Santos
	 * 20/01/2017
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(true);
		result.setTitle("Default Statements");
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CaseCaseDefault_statementsCompartment6ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(CrystalVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CaseCaseDefault_statementsCompartment6CanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == CrystalElementTypes.Expression_3243) {
				return this;
			}
			if (type == CrystalElementTypes.Exception_3244) {
				return this;
			}
			if (type == CrystalElementTypes.If_3245) {
				return this;
			}
			if (type == CrystalElementTypes.Case_3256) {
				return this;
			}
			if (type == CrystalElementTypes.Insert_3257) {
				return this;
			}
			if (type == CrystalElementTypes.Update_3258) {
				return this;
			}
			if (type == CrystalElementTypes.Delete_3259) {
				return this;
			}
			if (type == CrystalElementTypes.Select_3260) {
				return this;
			}
			if (type == CrystalElementTypes.While_3261) {
				return this;
			}
			if (type == CrystalElementTypes.For_3274) {
				return this;
			}
			if (type == CrystalElementTypes.Loop_3275) {
				return this;
			}
			if (type == CrystalElementTypes.Open_3276) {
				return this;
			}
			if (type == CrystalElementTypes.Fetch_3277) {
				return this;
			}
			if (type == CrystalElementTypes.Close_3278) {
				return this;
			}
			if (type == CrystalElementTypes.CallProcedure_3279) {
				return this;
			}
			if (type == CrystalElementTypes.CallFunction_3280) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(CrystalElementTypes.Transition_4001))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
