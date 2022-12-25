package react.beautiful.dnd

import dom.html.HTMLElement
import js.core.ReadonlyArray
import js.core.ReadonlyRecord
import react.CSSProperties
import react.Props
import react.ReactElement
import react.ReactNode
import react.dom.events.DragEventHandler
import react.dom.events.TransitionEventHandler
import react.dom.html.HTMLAttributes
import web.events.Event

external interface Position {
    var x: Double
    var y: Double
}

external interface BoxModel {
    // content + padding + border + margin
    var marginBox: Rect

    // content + padding + border
    var borderBox: Rect

    // content + padding
    var paddingBox: Rect

    // content
    var contentBox: Rect

    // for your own consumption
    var border: Spacing
    var padding: Spacing
    var margin: Spacing
}

// This is an extension of DOMRect and ClientRect
external interface Rect {
    // ClientRect
    var top: Double
    var right: Double
    var bottom: Double
    var left: Double
    var width: Double
    var height: Double

    // DOMRect
    var x: Double
    var y: Double

    // Rect
    var center: Position
}

external interface Spacing {
    var top: Double
    var right: Double
    var bottom: Double
    var left: Double
}

typealias DroppableMode = String // 'standard' | 'virtual';

external interface DroppableDescriptor {
    var id: DroppableId
    var type: TypeId
    var mode: DroppableMode
}

external interface DraggableDescriptor {
    var id: DraggableId
    var index: Int

    // Inherited from Droppable
    var droppableId: DroppableId

    // This is technically redundant but it avoids
    // needing to look up a parent droppable just to get its type
    var type: TypeId
}

external interface DraggableOptions {
    var canDragInteractiveElements: Boolean
    var shouldRespectForcePress: Boolean
    var isEnabled: Boolean
}

typealias Direction = String // 'horizontal' | 'vertical';

external interface VerticalAxis : Axis

external interface HorizontalAxis : Axis

external interface Axis {
    var direction: String // 'vertical' | 'horizontal'
    var line: String // 'y' | 'x'
    var start: String // 'top' | 'left'
    var end: String // 'bottom' | 'right'
    var size: String // 'height' | 'width'
    var crossAxisLine: String // 'x' | 'y'
    var crossAxisStart: String // 'left' | 'top'
    var crossAxisEnd: String // 'right' | 'bottom'
    var crossAxisSize: String // 'width' | 'height'
}

external interface ScrollSize {
    var scrollHeight: Double
    var scrollWidth: Double
}

external interface ScrollDifference {
    var value: Position

    // The actual displacement as a result of a scroll is in the opposite
    // direction to the scroll itself. When scrolling down items are displaced
    // upwards. This value is the negated version of the 'value'
    var displacement: Position
}

external interface ScrollDetails {
    var initial: Position
    var current: Position

    // the maximum allowable scroll for the frame
    var max: Position
    var diff: ScrollDifference
}

external interface Placeholder {
    var client: BoxModel
    var tagName: String
    var display: String
}

external interface DraggableDimension {
    var descriptor: DraggableDescriptor

    // the placeholder for the draggable
    var placeholder: Placeholder

    // relative to the viewport when the drag started
    var client: BoxModel

    // relative to the whole page
    var page: BoxModel

    // how much displacement the draggable causes
    // this is the size of the marginBox
    var displaceBy: Position
}

external interface Scrollable {
    // This is the window through which the droppable is observed
    // It does not change during a drag
    var pageMarginBox: Rect

    // Used for comparision with dynamic recollecting
    var frameClient: BoxModel
    var scrollSize: ScrollSize

    // Whether or not we should clip the subject by the frame
    // Is controlled by the ignoreContainerClipping prop
    var shouldClipSubject: Boolean
    var scroll: ScrollDetails
}

external interface PlaceholderInSubject {
    // might not actually be increased by
    // placeholder if there is no required space
    var increasedBy: Position?
    var placeholderSize: Position

    // max scroll before placeholder added
    // will be null if there was no frame
    var oldFrameMaxScroll: Position?
}

external interface DroppableSubject {
    // raw, unchanging
    var page: BoxModel
    var withPlaceholder: PlaceholderInSubject?

    // The hitbox for a droppable
    // - page margin box
    // - with scroll changes
    // - with any additional droppable placeholder
    // - clipped by frame
    // The subject will be null if the hit area is completely empty
    var active: Rect?
}

external interface DroppableDimension {
    var descriptor: DroppableDescriptor
    var axis: Axis
    var isEnabled: Boolean
    var isCombineEnabled: Boolean

    // relative to the current viewport
    var client: BoxModel

    // relative to the whole page
    var isFixedOnPage: Boolean

    // relative to the page
    var page: BoxModel

    // The container of the droppable
    var frame: Scrollable?

    // what is visible through the frame
    var subject: DroppableSubject
}

external interface DraggableLocation {
    var droppableId: DroppableId
    var index: Int
}

typealias DraggableIdMap = ReadonlyRecord<String, Boolean /* true */>

typealias DroppableIdMap = ReadonlyRecord<String, Boolean /* true */>

typealias DraggableDimensionMap = ReadonlyRecord<String, DraggableDimension>

typealias DroppableDimensionMap = ReadonlyRecord<String, DroppableDimension>

external interface Displacement {
    var draggableId: DraggableId
    var shouldAnimate: Boolean
}

typealias DisplacementMap = ReadonlyRecord<String, Displacement>

external interface DisplacedBy {
    var value: Double
    var point: Position
}

// details of the item that is being combined with
external interface Combine {
    var draggableId: DraggableId
    var droppableId: DroppableId
}

external interface DisplacementGroups {
    var all: ReadonlyArray<DraggableId>
    var visible: DisplacementMap
    var invisible: DraggableIdMap
}

external interface ReorderImpact {
    var type: String // 'REORDER'
    var destination: DraggableLocation
}

external interface CombineImpact {
    var type: String // 'COMBINE'
    var combine: Combine
}

typealias ImpactLocation = Any // ReorderImpact | CombineImpact

external interface Displaced {
    var forwards: DisplacementGroups
    var backwards: DisplacementGroups
}

external interface DragImpact {
    var displaced: DisplacementGroups
    var displacedBy: DisplacedBy
    var at: ImpactLocation?
}

external interface ClientPositions {
    // where the user initially selected
    // This point is not used to calculate the impact of a dragging item
    // It is used to calculate the offset from the initial selection point
    var selection: Position

    // the current center of the item
    var borderBoxCenter: Position

    // how far the item has moved from its original position
    var offset: Position
}

external interface PagePositions {
    var selection: Position
    var borderBoxCenter: Position

    // how much the page position has changed from the initial
    var offset: Position
}

// There are two seperate modes that a drag can be in
// FLUID: everything is done in response to highly granular input (eg mouse)
// SNAP: items move in response to commands (eg keyboard);
typealias MovementMode = String // 'FLUID' | 'SNAP';

external interface DragPositions {
    var client: ClientPositions
    var page: PagePositions
}

external interface DraggableRubric {
    var draggableId: DraggableId
    var type: TypeId
    var source: DraggableLocation
}

// Published in onBeforeCapture
// We cannot give more information as things might change in the
// onBeforeCapture responder!
external interface BeforeCapture {
    var draggableId: DraggableId
    var mode: MovementMode
}

// published when a drag starts
external interface DragStart : DraggableRubric {
    var mode: MovementMode
}

external interface DragUpdate : DragStart {
    // may not have any destination (drag to nowhere)
    var destination: DraggableLocation?

    // populated when a draggable is dragging over another in combine mode
    var combine: Combine?
}

typealias DropReason = String // 'DROP' | 'CANCEL';

external interface DropResult : DragUpdate {
    var reason: DropReason
}

external interface ScrollOptions {
    var shouldPublishImmediately: Boolean
}

// using the draggable id rather than the descriptor as the descriptor
// may change as a result of the initial flush. This means that the lift
// descriptor may not be the same as the actual descriptor. To avoid
// confusion the request is just an id which is looked up
// in the dimension-marshal post-flush
// Not including droppableId as it might change in a drop flush
external interface LiftRequest {
    var draggableId: DraggableId
    var scrollOptions: ScrollOptions
}

external interface Critical {
    var draggable: DraggableDescriptor
    var droppable: DroppableDescriptor
}

external interface Viewport {
    // live updates with the latest values
    var frame: Rect
    var scroll: ScrollDetails
}

external interface LiftEffect {
    var inVirtualList: Boolean
    var effected: DraggableIdMap
    var displacedBy: DisplacedBy
}

external interface DimensionMap {
    var draggables: DraggableDimensionMap
    var droppables: DroppableDimensionMap
}

external interface DroppablePublish {
    var droppableId: DroppableId
    var scroll: Position
}

external interface Published {
    var additions: ReadonlyArray<DraggableDimension>
    var removals: ReadonlyArray<DraggableId>
    var modified: ReadonlyArray<DroppablePublish>
}

external interface CompletedDrag {
    var critical: Critical
    var result: DropResult
    var impact: DragImpact
    var afterCritical: LiftEffect
}

external interface IdleState {
    var phase: String // 'IDLE'
    var completed: CompletedDrag?
    var shouldFlush: Boolean
}

external interface DraggingState {
    var phase: String // 'DRAGGING'
    var isDragging: Boolean // true
    var critical: Critical
    var movementMode: MovementMode
    var dimensions: DimensionMap
    var initial: DragPositions
    var current: DragPositions
    var impact: DragImpact
    var viewport: Viewport
    var afterCritical: LiftEffect
    var onLiftImpact: DragImpact

    // when there is a fixed list we want to opt out of this behaviour
    var isWindowScrollAllowed: Boolean

    // if we need to jump the scroll (keyboard dragging)
    var scrollJumpRequest: Position?

    // whether or not draggable movements should be animated
    var forceShouldAnimate: Boolean?
}

// While dragging we can enter into a bulk collection phase
// During this phase no drag updates are permitted.
// If a drop occurs during this phase, it must wait until it is
// completed before continuing with the drop
// TODO: rename to BulkCollectingState
external interface CollectingState : DraggingState {
    override var phase: String // 'COLLECTING'
}

// If a drop action occurs during a bulk collection we need to
// wait for the collection to finish before performing the drop.
// This is to ensure that everything has the correct index after
// a drop
external interface DropPendingState : DraggingState {
    override var phase: String // 'DROP_PENDING'
    var isWaiting: Boolean
    var reason: DropReason
}

// An optional phase for animating the drop / cancel if it is needed
external interface DropAnimatingState {
    var phase: String // 'DROP_ANIMATING'
    var completed: CompletedDrag
    var newHomeClientOffset: Position
    var dropDuration: Double

    // We still need to render placeholders and fix the dimensions of the dragging item
    var dimensions: DimensionMap
}

typealias State = Any // IdleState | DraggingState | CollectingState | DropPendingState | DropAnimatingState;

typealias StateWhenUpdatesAllowed = Any // DraggingState | CollectingState;

typealias Announce = (message: String) -> Unit

typealias InOutAnimationMode = String // 'none' | 'open' | 'close';

external interface ResponderProvided {
    var announce: Announce
}

typealias OnBeforeCaptureResponder = (before: BeforeCapture) -> Unit

typealias OnBeforeDragStartResponder = (start: DragStart) -> Unit

typealias OnDragStartResponder = (start: DragStart, provided: ResponderProvided) -> Unit

typealias OnDragUpdateResponder = (update: DragUpdate, provided: ResponderProvided) -> Unit

typealias OnDragEndResponder = (result: DropResult, provided: ResponderProvided) -> Unit

external interface Responders {
    var onBeforeCapture: OnBeforeCaptureResponder?
    var onBeforeDragStart: OnBeforeDragStartResponder?
    var onDragStart: OnDragStartResponder?
    var onDragUpdate: OnDragUpdateResponder?

    // always required
    var onDragEnd: OnDragEndResponder
}

external interface StopDragOptions {
    var shouldBlockNextClick: Boolean
}

external interface DragActions {
    var drop: (args: StopDragOptions?) -> Unit
    var cancel: (args: StopDragOptions?) -> Unit
    var isActive: () -> Boolean
    var shouldRespectForcePress: () -> Boolean
}

external interface FluidDragActions : DragActions {
    var move: (clientSelection: Position) -> Unit
}

external interface SnapDragActions : DragActions {
    var moveUp: () -> Unit
    var moveDown: () -> Unit
    var moveRight: () -> Unit
    var moveLeft: () -> Unit
}

external interface PreDragActions {
    // discover if the lock is still active
    var isActive: () -> Boolean

    // whether it has been indicated if force press should be respected
    var shouldRespectForcePress: () -> Boolean

    // lift the current item
    var fluidLift: (clientSelection: Position) -> FluidDragActions
    var snapLift: () -> SnapDragActions

    // cancel the pre drag without starting a drag. Releases the lock
    var abort: () -> Unit
}

external interface TryGetLockOptions {
    var sourceEvent: Event?
}

typealias TryGetLock = (
    draggableId: DraggableId,
    forceStop: (() -> Unit)?,
    options: TryGetLockOptions?,
) -> PreDragActions?

external interface SensorAPI {
    var tryGetLock: TryGetLock
    var canGetLock: (id: DraggableId) -> Boolean
    var isLockClaimed: () -> Boolean
    var tryReleaseLock: () -> Unit
    var findClosestDraggableId: (event: Event) -> DraggableId?
    var findOptionsForDraggable: (id: DraggableId) -> DraggableOptions?
}

typealias Sensor = (api: SensorAPI) -> Unit

/**
 *  Droppable
 */

// Refer to https://github.com/atlassian/react-beautiful-dnd/blob/master/src/view/droppable/droppable-types.js

external interface DroppableProvidedProps : Props {
    // used for shared global styles
    // TODO: uncomment
    // var 'data-rbd-droppable-context-id': ContextId
    // Used to lookup. Currently not used for drag and drop lifecycle
    // TODO: uncomment
    // var 'data-rbd-droppable-id': DroppableId
}

external interface DroppableProvided {
    var innerRef: (element: HTMLElement?) -> Unit
    var placeholder: ReactNode
    var droppableProps: DroppableProvidedProps
}

external interface DroppableStateSnapshot {
    var isDraggingOver: Boolean
    var draggingOverWith: DraggableId?
    var draggingFromThisWith: DraggableId?
    var isUsingPlaceholder: Boolean
}

/**
 *  Draggable
 */

// Refer to https://github.com/atlassian/react-beautiful-dnd/blob/master/src/view/draggable/draggable-types.js

external interface DropAnimation {
    var duration: Double
    var curve: String
    var moveTo: Position

    /**
     * This value will actually be `null` instead of `undefined`.
     *
     * The type is fudged because `null` is not compatible with the
     * `React.CSSProperties` type.
     *
     * The `style` prop should interpret `null` and `undefined` the same way.
     */
    var opacity: Double?

    /**
     * This value will actually be `null` instead of `undefined`.
     *
     * The type is fudged because `null` is not compatible with the
     * `React.CSSProperties` type.
     *
     * The `style` prop should interpret `null` and `undefined` the same way.
     */
    var scale: Double?
}

external interface NotDraggingStyle {
    /**
     * This value will actually be `null` instead of `undefined`.
     *
     * The type is fudged because `null` is not compatible with the
     * `React.CSSProperties` type.
     *
     * The `style` prop should interpret `null` and `undefined` the same way.
     */
    var transform: String?

    /**
     * This value will actually be `null` instead of `undefined`.
     *
     * The type is fudged because `null` is not compatible with the
     * `React.CSSProperties` type.
     *
     * The `style` prop should interpret `null` and `undefined` the same way.
     */
    var transition: String? // 'none'
}

external interface DraggingStyle {
    var position: String // 'fixed'
    var top: Double
    var left: Double
    var boxSizing: String // 'border-box'
    var width: Double
    var height: Double
    var transition: String

    /**
     * This value will actually be `null` instead of `undefined`.
     *
     * The type is fudged because `null` is not compatible with the
     * `React.CSSProperties` type.
     *
     * The `style` prop should interpret `null` and `undefined` the same way.
     */
    var transform: String?
    var zIndex: Int

    /**
     * This value will actually be `null` instead of `undefined`.
     *
     * The type is fudged because `null` is not compatible with the
     * `React.CSSProperties` type.
     *
     * The `style` prop should interpret `null` and `undefined` the same way.
     */
    var opacity: Double?
    var pointerEvents: String // 'none'
}

external interface DraggableProvidedDraggableProps : Props {
    // inline style
    var style: CSSProperties // DraggingStyle | NotDraggingStyle?

    // used for shared global styles
    // TODO: uncomment
    // var 'data-rbd-draggable-context-id': String
    // TODO: uncomment
    // var 'data-rbd-draggable-id': String
    var onTransitionEnd: TransitionEventHandler<*>?
}

external interface DraggableProvidedDragHandleProps : Props {
    // TODO: uncomment
    // var 'data-rbd-drag-handle-draggable-id': DraggableId
    // TODO: uncomment
    // var 'data-rbd-drag-handle-context-id': ContextId
    // TODO: uncomment
    // var 'aria-describedby': ElementId

    var role: String
    var tabIndex: Int
    var draggable: Boolean
    var onDragStart: DragEventHandler<*>
}

external interface DraggableProvided {
    // will be removed after move to react 16
    var innerRef: (element: HTMLElement?) -> Unit
    var draggableProps: DraggableProvidedDraggableProps
    var dragHandleProps: DraggableProvidedDragHandleProps?
}

external interface DraggableStateSnapshot {
    var isDragging: Boolean
    var isDropAnimating: Boolean
    var isClone: Boolean
    var dropAnimation: DropAnimation?
    var draggingOver: DroppableId?

    // the id of a draggable that you are combining with
    var combineWith: DraggableId?

    // a combine target is being dragged over by
    var combineTargetFor: DraggableId?

    // What type of movement is being done: 'FLUID' or 'SNAP'
    var mode: MovementMode?
}

typealias DraggableChildrenFn = (
    provided: DraggableProvided,
    snapshot: DraggableStateSnapshot,
    rubric: DraggableRubric,
) -> ReactElement<HTMLAttributes<*>>
