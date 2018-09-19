/**
 */
package vml.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import vml.util.VmlAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VmlItemProviderAdapterFactory extends VmlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Column} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnItemProvider columnItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnAdapter() {
		if (columnItemProvider == null) {
			columnItemProvider = new ColumnItemProvider(this);
		}

		return columnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Row} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowItemProvider rowItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRowAdapter() {
		if (rowItemProvider == null) {
			rowItemProvider = new RowItemProvider(this);
		}

		return rowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Cell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellItemProvider cellItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCellAdapter() {
		if (cellItemProvider == null) {
			cellItemProvider = new CellItemProvider(this);
		}

		return cellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Style} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleItemProvider styleItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStyleAdapter() {
		if (styleItemProvider == null) {
			styleItemProvider = new StyleItemProvider(this);
		}

		return styleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.GraphStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphStyleItemProvider graphStyleItemProvider;

	/**
	 * This creates an adapter for a {@link vml.GraphStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphStyleAdapter() {
		if (graphStyleItemProvider == null) {
			graphStyleItemProvider = new GraphStyleItemProvider(this);
		}

		return graphStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.NodeStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeStyleItemProvider nodeStyleItemProvider;

	/**
	 * This creates an adapter for a {@link vml.NodeStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeStyleAdapter() {
		if (nodeStyleItemProvider == null) {
			nodeStyleItemProvider = new NodeStyleItemProvider(this);
		}

		return nodeStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.EdgeStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeStyleItemProvider edgeStyleItemProvider;

	/**
	 * This creates an adapter for a {@link vml.EdgeStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeStyleAdapter() {
		if (edgeStyleItemProvider == null) {
			edgeStyleItemProvider = new EdgeStyleItemProvider(this);
		}

		return edgeStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.ChartWithAxisStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartWithAxisStyleItemProvider chartWithAxisStyleItemProvider;

	/**
	 * This creates an adapter for a {@link vml.ChartWithAxisStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartWithAxisStyleAdapter() {
		if (chartWithAxisStyleItemProvider == null) {
			chartWithAxisStyleItemProvider = new ChartWithAxisStyleItemProvider(this);
		}

		return chartWithAxisStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.ChartWithoutAxisStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartWithoutAxisStyleItemProvider chartWithoutAxisStyleItemProvider;

	/**
	 * This creates an adapter for a {@link vml.ChartWithoutAxisStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartWithoutAxisStyleAdapter() {
		if (chartWithoutAxisStyleItemProvider == null) {
			chartWithoutAxisStyleItemProvider = new ChartWithoutAxisStyleItemProvider(this);
		}

		return chartWithoutAxisStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Pie} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieItemProvider pieItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Pie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPieAdapter() {
		if (pieItemProvider == null) {
			pieItemProvider = new PieItemProvider(this);
		}

		return pieItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Slice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliceItemProvider sliceItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Slice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSliceAdapter() {
		if (sliceItemProvider == null) {
			sliceItemProvider = new SliceItemProvider(this);
		}

		return sliceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Graph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphItemProvider graphItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Graph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphAdapter() {
		if (graphItemProvider == null) {
			graphItemProvider = new GraphItemProvider(this);
		}

		return graphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Edge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeItemProvider edgeItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeAdapter() {
		if (edgeItemProvider == null) {
			edgeItemProvider = new EdgeItemProvider(this);
		}

		return edgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.ChartElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartElementItemProvider chartElementItemProvider;

	/**
	 * This creates an adapter for a {@link vml.ChartElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartElementAdapter() {
		if (chartElementItemProvider == null) {
			chartElementItemProvider = new ChartElementItemProvider(this);
		}

		return chartElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.BarChart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarChartItemProvider barChartItemProvider;

	/**
	 * This creates an adapter for a {@link vml.BarChart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBarChartAdapter() {
		if (barChartItemProvider == null) {
			barChartItemProvider = new BarChartItemProvider(this);
		}

		return barChartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Bar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarItemProvider barItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Bar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBarAdapter() {
		if (barItemProvider == null) {
			barItemProvider = new BarItemProvider(this);
		}

		return barItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.StackBarChart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackBarChartItemProvider stackBarChartItemProvider;

	/**
	 * This creates an adapter for a {@link vml.StackBarChart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStackBarChartAdapter() {
		if (stackBarChartItemProvider == null) {
			stackBarChartItemProvider = new StackBarChartItemProvider(this);
		}

		return stackBarChartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Category} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryItemProvider categoryItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryAdapter() {
		if (categoryItemProvider == null) {
			categoryItemProvider = new CategoryItemProvider(this);
		}

		return categoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.StackBars} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackBarsItemProvider stackBarsItemProvider;

	/**
	 * This creates an adapter for a {@link vml.StackBars}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStackBarsAdapter() {
		if (stackBarsItemProvider == null) {
			stackBarsItemProvider = new StackBarsItemProvider(this);
		}

		return stackBarsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.LineChart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineChartItemProvider lineChartItemProvider;

	/**
	 * This creates an adapter for a {@link vml.LineChart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineChartAdapter() {
		if (lineChartItemProvider == null) {
			lineChartItemProvider = new LineChartItemProvider(this);
		}

		return lineChartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Point} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointItemProvider pointItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointAdapter() {
		if (pointItemProvider == null) {
			pointItemProvider = new PointItemProvider(this);
		}

		return pointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Scatter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScatterItemProvider scatterItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Scatter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScatterAdapter() {
		if (scatterItemProvider == null) {
			scatterItemProvider = new ScatterItemProvider(this);
		}

		return scatterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vml.Color} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorItemProvider colorItemProvider;

	/**
	 * This creates an adapter for a {@link vml.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColorAdapter() {
		if (colorItemProvider == null) {
			colorItemProvider = new ColorItemProvider(this);
		}

		return colorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (tableItemProvider != null) tableItemProvider.dispose();
		if (columnItemProvider != null) columnItemProvider.dispose();
		if (rowItemProvider != null) rowItemProvider.dispose();
		if (cellItemProvider != null) cellItemProvider.dispose();
		if (styleItemProvider != null) styleItemProvider.dispose();
		if (graphStyleItemProvider != null) graphStyleItemProvider.dispose();
		if (nodeStyleItemProvider != null) nodeStyleItemProvider.dispose();
		if (edgeStyleItemProvider != null) edgeStyleItemProvider.dispose();
		if (chartWithAxisStyleItemProvider != null) chartWithAxisStyleItemProvider.dispose();
		if (chartWithoutAxisStyleItemProvider != null) chartWithoutAxisStyleItemProvider.dispose();
		if (pieItemProvider != null) pieItemProvider.dispose();
		if (sliceItemProvider != null) sliceItemProvider.dispose();
		if (graphItemProvider != null) graphItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (edgeItemProvider != null) edgeItemProvider.dispose();
		if (chartElementItemProvider != null) chartElementItemProvider.dispose();
		if (barChartItemProvider != null) barChartItemProvider.dispose();
		if (barItemProvider != null) barItemProvider.dispose();
		if (stackBarChartItemProvider != null) stackBarChartItemProvider.dispose();
		if (categoryItemProvider != null) categoryItemProvider.dispose();
		if (stackBarsItemProvider != null) stackBarsItemProvider.dispose();
		if (lineChartItemProvider != null) lineChartItemProvider.dispose();
		if (pointItemProvider != null) pointItemProvider.dispose();
		if (scatterItemProvider != null) scatterItemProvider.dispose();
		if (colorItemProvider != null) colorItemProvider.dispose();
	}

}
